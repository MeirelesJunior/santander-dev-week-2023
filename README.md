# SANTANDER DEV WEEK 2023

Java RESTful API criada para a Santander Dev Week

##Diagrama de Classes

```mermaid
classDiagram
    class User{
        -String name
        -Account account
        -List<Feature> features
        -Card card
        -List<News> news
    }
    class Account{
        -String accountNumber
        -String accountAgency
        -Double balance
        -Double limit
    }
    class Feature{
        -String icon
        -String description
    }
    class Card{
        -String cardNumber
        -Double cardLimit
    }
    class News{
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" * -- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
