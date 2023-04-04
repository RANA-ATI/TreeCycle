import cv2
import numpy as np
import tensorflow as tf
from keras.optimizers import Adam
from keras.models import Sequential
from tensorflow.python.keras.layers import Dense, Flatten


def recyclePrediction(img):
    vgg16_model = Sequential()  # Initialization, layers added in sequence

    pretrained_model = tf.keras.applications.VGG16(
        include_top=False,
        weights="imagenet",
        input_tensor=None,
        input_shape=(180, 180, 3),
        pooling='max',
        classes=7,
    )
    for layer in pretrained_model.layers:
        layer.trainable = False  # Means we are freezing intermediate layers which will extract the features -> Only input and output fully connected layers are opened

    vgg16_model.add(pretrained_model)
    vgg16_model.add(Flatten())
    vgg16_model.add(Dense(512, activation='relu'))  # Number of neurons = 512
    vgg16_model.add(Dense(7, activation='softmax'))

    vgg16_model.compile(optimizer=Adam(learning_rate=0.001), loss='sparse_categorical_crossentropy', metrics=[
                        'accuracy'])  # After sequential initialization compilation is nessessry to compile the model

    vgg16_model.load_weights('updated_vgg16_weights.h5')

    class_names = ['1_polyethylene_PET', '2_high_density_polyethylene_PE-HD', '3_polyvinylchloride_PVC',
                   '4_low_density_polyethylene_PE-LD', '5_polypropylene_PP', '6_polystyrene_PS', '8_no_plastic']

    # image = cv2.imread(img)
    image_resized = cv2.resize(img, (180, 180))
    # We need to have this in 4 dimensions, cuz it trained on multiple images
    image = np.expand_dims(image_resized, axis=0)
    pred = vgg16_model.predict(image)
    output_class = class_names[np.argmax(pred)]

    return output_class
