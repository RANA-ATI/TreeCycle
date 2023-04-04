import torch
import cv2

def countTree(img):
    # Load the trained model from the checkpoint file
    model = torch.hub.load(r'YOLO', 'custom', source='local',
                           path=r'best.pt', force_reload=True)
    results = model(img)

    num_bboxes = len(results.xyxy[0])

    num_bboxes = str(num_bboxes)

    return num_bboxes
