## Delivery Ecomerce Project ##

## About this project ##

This project is a small model in E-Delivery approach for a B2B model. 
User roles: Admin, Staff, Delivery, Customer (owner of small stores that need delivery service)
+ Admin: Can manage all the data in application: Branch, Order, City (where company work in), Staff (staff, delivery), Cutomer. Assign delivery staff to area
+ Staff: Can mange order: approve, see order details
+ Delivery: Can see all order in areas that they was assigned to.
+ Custoemr: Owner of small stores. Can manage stores, mange order in a store.

I'm using Java with Spring framework for this project so remember to set up your environment with Java
My full report with Vietnamese language here: https://shorturl.at/euJMS

## Technique ##

I was practise some kinds of Design Pattern in this project. Some of them have already been on Spring framework but I was still rework with it, just be generous with my first art. Thank you.
Design patterns:
+ Dependency Injection
+ Factory Method
+ Composite
+ Projection
+ Template Methosd
+ Singleton
+ Facade
+ Prototye

+ See more detail with Vietnamese language in this link: https://shorturl.at/euJMS

## Run it ##

This server will run locally in MySQL. 
#1 Have MySQL in your computer. If dont then download one.
https://dev.mysql.com/downloads/installer/
>> Remember to create username and password carefully (remember it or write it to somewhere)

#2 Create database in MySQL:
schema name: delivery (on your choice) \n 
port: 3306 => This can change depending on your choice, feel free \n
database name: delivery => Run SQL code: "create database delivery"  \n

#3 Clone this project and change few line in this file: application.properties
>> spring.datasource.url=jdbc:mysql://localhost:3306/delivery => change "delivery" if you named different database name. 
>> spring.datasource.username=root => root will be depend on your MySQL when you installed it.

#4 Now click run it 
I'm using Inteliji IDE  

