Created a spring boot app for Mini Too good to Go which will be used to add new food item , get available food items and update food items.
created below GET, POST and PUT REST Apis :
POST :  http://localhost:8080/api/food/add   -- to add new food items ex:
{
  "name": "Bread",
  "restaurant": "Netto",
  "price": 5.99
}
{
  "name": "Pizza",
  "restaurant": "Dominos",
  "price": 5.99,
}

GET API:To see all available food items
http://localhost:8080/api/food/available
Output : 
 {
        "id": 1,
        "name": "Burger",
        "restaurant": "Grill",
        "price": 5.99,
        "reserved": false,
        "expiryDate": "2025-04-03T23:50:32.416665"
    },
    {
        "id": 2,
        "name": "Pizza",
        "restaurant": "Dominos",
        "price": 5.99,
        "reserved": false,
        "expiryDate": "2025-03-01T01:09:42.583179"
    },
    {
        "id": 3,
        "name": "Bread",
        "restaurant": "Netto",
        "price": 5.99,
        "reserved": false,
        "expiryDate": "2025-04-03T23:50:53.855665"
    }

POST API to reserve the food item with ID:
POST : http://localhost:8080/api/food/reserve/1
output : {
    "id": 1,
    "name": "Burger",
    "restaurant": "Grill",
    "price": 5.99,
    **"reserved": true,**
    "expiryDate": "2025-04-03T23:50:32.416665"
}
