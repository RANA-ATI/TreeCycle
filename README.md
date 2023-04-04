# TreeCycle
GDCSE SOLUTION ML-BASED APPLICATION FOR CLIMATE ACTION

We have divided our project into two parts 
One is machine and deep leanring model part and its code whereas its been deployed at hugging face
Two is app part the front-end has been properly made

We havent integrated both of these due to lesser time. Infact they are working perfectly fine induvidually.


As far as machine leanring part is concerned there are two apis

1) https://ranati-gdcse-project-1.hf.space/tree-count
2) https://ranati-gdcse-project-1.hf.space/recycle-prediction


1) It will work if you give url of google map api e.g: https://ranati-gdcse-project-1.hf.space/tree-count/https://maps.googleapis.com/maps/api/staticmap?center=31.4114048,74.2260736&zoom=20&scale=2&size=640x640&maptype=satellite&key=AIzaSyD2NkVHMB_8P7-R34afx0M3o0V3YT_vLQE

this will give result in form of JSON number of trees (Tree count) in the specifc image

2) For this we need it to be integrated which due to lesser time wasnt possible hence if you give it an image of recycling symbol it will predict the type and material of it.

Here is the video tutorial for that:

FOR BETTER AND EASY UNDERSTANDING AS WITHOUT INTEGRATION WITH APP IT CANNOTT BE PROPERLY OBSERVED, WE MADE A SIMPLE HTML TEMPLATE TO RECIEVE AND SEND REQUESTS AND GET PREDICTED MODEL RESULTS
https://drive.google.com/file/d/1n08-2BnBf8QAFerVFHw8Eca-dcjZAj_E/view?usp=share_link

AS FAR AS APPLICATION IS CONCERNED WE HAVE MADE PROPER INTERFACE WHICH CAN BE SEEN IN THE VIDEO AS WELL THE ONLY THING LEFT IS INTEGRATION WITH MACHINE LEARNING PART
