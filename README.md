# Spring Boot Reactive Customer APIs

A **practice backend project** built using **Spring Boot WebFlux** and **MongoDB**, demonstrating **Reactive CRUD operations** with non-blocking I/O.  
This project focuses purely on backend REST APIs — built for learning and exploring reactive programming concepts.

---

## Tech Stack

- **Java 21**
- **Spring Boot 3.5.7**
- **Spring WebFlux (Reactive)**
- **Spring Data Reactive MongoDB**
- **Project Reactor (Mono / Flux)**
- **Maven**
- **MongoDB**

---

## Features

- Create new customer  
- Retrieve all customers  
- Retrieve a customer by ID  
- Update a customer by ID  
- Delete a customer by ID  
- Delete all customers  

---

## API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| `POST` | `/createcustomer` | Create a new customer |
| `POST` | `/customersave` |Save a customer |
| `GET` | `/getAllCustomer` | Get all customers |
| `GET` | `/getbyId/{id}` | Get a single customer by ID |
| `PUT` | `/upadtebyId/{id}` | Update an existing customer |
| `DELETE` | `/deletebyId/{id}` | Delete a customer by ID |
| `DELETE` | `/deleteAllCustomer` | Delete all customers |

---

## Sample Request Body (POST / PUT)

```json
{
   "id": "101",
    "firstName": "Som",
    "lastName": "Gupta",
    "email": "Som@gmail.com",
    "password": "Som@987",
    "contactId": 8002245555
}
```
## Tools used in testing Rest APIs 

- Postman
- Insomnia
- Hoppscotch (Web based)
