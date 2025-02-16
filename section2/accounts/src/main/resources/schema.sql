CREATE TABLE IF NOT EXISTS customer(
customer_id int AUTO_INCREMENT PRIMARY KEY,
name varchar(100) Not Null,
email varchar(100) NOT NULL,
mobile_number varchar(20) NOT NULL,
created_at date Not null,
created_by varchar(20) NOT NULL,
updated_at date DEFAULT NULL,
updated_by varchar(20) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS accounts(
customer_id int NOT Null,
account_number int AUTO_INCREMENT PRIMARY KEY,
account_type varchar(100) NOT Null,
branch_address varchar(200) NOT Null,
created_at date Not null,
created_by varchar(20) NOT NULL,
updated_at date DEFAULT NULL,
updated_by varchar(20) DEFAULT NULL
);