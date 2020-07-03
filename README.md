# walletPay
CRUD operation Spring boot
star-pay-controller
Star Pay Controller


![image](https://user-images.githubusercontent.com/45733514/86473444-8722c600-bd5e-11ea-8609-fcca5a13089b.png)


POST
{BASE-URL}/starPay/addUser
addUser->
{
  "addressAccess": "EDIT",
  "addressType": "string",
  "city": "string",
  "companyName": "string",
  "firstName": "string",
  "fullAddress": "string",
  "gender": "string",
  "lastName": "string",
  "mobileNumber": "string",
  "province": "string",
  "status": "string",
  "userAccess": "EDIT",
  "zipcode": "string"
}


GET
{BASE-URL}/starPay/checK
ckecK


POST
{BASE-URL}/starPay/getButton
getButtonFeature->
{
  "buttons": [
    {
      "featureName": "string",
      "id": 0,
      "isActive": true,
      "status": "string"
    }
  ]
}


GET
{BASE-URL}/starPay/getUser
getAllUser->
[
  {
    "address": [
      {
        "addressType": "string",
        "city": "string",
        "fullAddress": "string",
        "province": "string",
        "zipcode": "string"
      }
    ],
    "companyName": "string",
    "firstName": "string",
    "gender": "string",
    "id": 0,
    "isAdmin": true,
    "lastName": "string",
    "mobileNumber": "string",
    "status": "string"
  }
]


POST
{BASE-URL}/starPay/SetButton
setButtonFeature->
{
  "featureName": "string",
  "id": 0,
  "status": "string"
}


POST
{BASE-URL}/starPay/setPortalUserManagement
setPortalUserManagement->
{
  "addressType": "string",
  "bayaditoAccess": "EDIT",
  "billPaymentAccess": "EDIT",
  "city": "string",
  "companyName": "string",
  "eMoneyServiceAccess": "EDIT",
  "eMoneySetLimitAccess": "EDIT",
  "firstName": "string",
  "fullAddress": "string",
  "gender": "string",
  "lastName": "string",
  "mobileNumber": "string",
  "pdAccess": "EDIT",
  "portalAccess": "EDIT",
  "portalUserHistoryAccess": "EDIT",
  "province": "string",
  "rdAccess": "EDIT",
  "status": "string",
  "walletAccess": "EDIT",
  "zipcode": "string"
}




