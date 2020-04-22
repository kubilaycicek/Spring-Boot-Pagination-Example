# Spring boot pagination example
This is a spring boot application.Pagination example.

### Model
```json
{
   "id": 1,
   "name": "Lebron",
   "surname": "James"
        }
```
### API
| Route  | HTTP Verb  |POST Body   |Description   |
|---|---|---|---|
| http://localhost:8080/customer/list?pageSize=5&page=0  |`GET`   |  Empty | List All Notes    

### Response

```json
{
    "content": [
        {
            "id": 1,
            "name": "Lebron",
            "surname": "James"
        },
        {
            "id": 2,
            "name": "Sthephen",
            "surname": "Curry"
        },
        {
            "id": 3,
            "name": "Michael",
            "surname": "Jordan"
        },
        {
            "id": 4,
            "name": "Kobe",
            "surname": "Bryant"
        },
        {
            "id": 5,
            "name": "Kevin",
            "surname": "Durant"
        }
    ],
    "pageable": {
        "sort": {
            "sorted": false,
            "unsorted": true,
            "empty": true
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 5,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalPages": 3,
    "totalElements": 15,
    "number": 0,
    "size": 5,
    "sort": {
        "sorted": false,
        "unsorted": true,
        "empty": true
    },
    "numberOfElements": 5,
    "first": true,
    "empty": false
}
```


