FROM python:3.9

COPY requirements.txt .

RUN pip install -r requirements.txt

RUN apt-get update && apt-get install -y libgl1-mesa-glx

RUN python -c "import cv2; import numpy"

COPY . .

EXPOSE 7860

CMD ["flask", "run", "--host=0.0.0.0", "--port=7860"]