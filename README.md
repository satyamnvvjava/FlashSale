## Details of FlashSale Repository
This repository is having two micor services:
### 1.FlashSaleSrvc
### 2.FlashSaleEmailSrvc

For ER Diagrams and architecture please see in wiki.

http://fs-email-service/sendFSEmails
request type: POST
with request header: content-type: application/json
request pay load:
{"fsId":23,"fsName":"wrist watch sale","fsDateStarts":61554137400000,"fsDateEnds":61554180600000,"fsItemCount":2,"fsOfferPrice":1,"itemName":"wrist watch","itemActualPrice":500}
response:


http://flashsale-service/registerUser
request type: POST
with request header: content-type: application/json
request pay load:
{"userName":"satya","flashSaleId":23,"deliveryAddress":{"line1":"2-3-4/1/a balakampet ","line2":"hyd, ts, india"}}
response: registration success or registration faild!!

http://flashsale-service/triggerflashsale
request type: POST
with request header: content-type: application/json
request pay load:

http://flashsale-service/purchase

Deployment of these services is tested in GCP with k8s.
For both the services docker images are created and k8s deployment YAML files are also created

Deployment steps will be updated soon......
