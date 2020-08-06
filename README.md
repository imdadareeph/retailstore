# retailstore
retailstore application


## Environment for Development
 Those projects were developed with followings.

 * Java SDK 8 (1.8.0_112)
 * JSF (2.x)
 * Hibernate (5.x)
 
 ## Run the demo
The whole application has been packaged to be run as mvn spring-boot:run followed by h2-console insert query:
```
CREATE TABLE `customer_details` (
  `customer_id` int(12) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(200) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `address` varchar(500) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `customer_type` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
);
```

### Clone the application codes
 You need a new folder to clone the codes and you can get the codes from git repo.
 ```
 git clone https://github.com/imdadareeph/retailstore.git
 ```
 
 ### Screenshots
 
 ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/1.png "preview1")
  ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/2.png "preview2")
  ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/3.png "preview3")
  ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/4.png "preview4")
  ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/5.png "preview5")

  ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/6.png "preview6")
  ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/7.png "preview7")
  ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/8.png "preview8")
  ![alt text](https://raw.githubusercontent.com/imdadareeph/retailstore/master/src/main/resources/static/screenshots/9.png "preview9")

