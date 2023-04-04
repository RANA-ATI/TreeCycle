from flask import Flask, request
import recycleModel
import treeCountModel
import numpy as np
import urllib.request
import cv2
import requests

app = Flask(__name__)

@app.route("/", methods=["GET", "POST"])
def index():
    message = "Welcome to my API! Here are the available endpoints:"
    recycle_url = request.host_url + "recycle-prediction"
    tree_count_url = request.host_url + "tree-count"
    response = {
        "message": message,
        "endpoints": {
            "recycle_prediction": recycle_url,
            "tree_count": tree_count_url
        }
    }
    return response, 200

@app.route("/recycle-prediction", methods=["GET", "POST"])
def recycle():
    result = None
    if request.method == "POST":
        if 'img' not in request.files:
            return "No file uploaded for recycling material prediction", 400
        img = request.files['img']
        img_array = cv2.imdecode(np.frombuffer(
            img.read(), np.uint8), cv2.IMREAD_COLOR)
        model = recycleModel.recyclePrediction(img_array)
        # model = recycleModel.recyclePrediction(img)
        response = {
            "Recycling Material": model
        }
        result = response
        return result

    return result


@app.route("/tree-count", methods=["GET", "POST"])
def treeCount():
    if request.method == "POST":
        url = request.form.get('image-url')
        if url is None:
            return "No image URL provided", 400
        
        # Download the image from the URL and save it locally
        filename, headers = urllib.request.urlretrieve(url)
        
        # Load the image from the local file and count the number of trees
        img_array = cv2.imread(filename)
        model = treeCountModel.countTree(img_array)
        
        response = {
            "Number of Trees": model
        }
        
        return response, 200
    else:
        return "", 405


# @app.route("/tree-count", methods=["GET", "POST"])
# def treeCount():
#     result = None
#     if request.method == "POST":
#         url = request.args.get('image-url')
#         if url is None:
#             return "No image URL provided", 400
#         response = requests.get(url)
#         img_array = cv2.imdecode(np.frombuffer(
#             response.content, np.uint8), cv2.IMREAD_COLOR)
#         model = treeCountModel.countTree(img_array)
#         response = {
#             "Number of Trees": model
#         }
#         result = response
#         return result
#     else:
#         return "", 200

if __name__ == "__main__":
    try:
        app.run(debug=True)
    except Exception as e:
        print(e)