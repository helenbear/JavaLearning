create database store1;
use store1;
create table product1(
id int auto_increment primary key,
productId varchar(20),
productName varchar(20),
price float,
productType varchar(20),
imgUrl varchar(200)
);