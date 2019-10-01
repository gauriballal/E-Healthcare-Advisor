create database e_healthcare_advisor;

use e_healthcare_advisor;

create table register_patient(patient_id int auto_increment not null,name varchar(20) not null,email varchar(20) not null,mobile_no bigint not null,password varchar(20) not null,confirm_password varchar(20) not null,primary key(patient_id));

 select * from register_patient;
+------------+---------+-------------------+------------+-------------+------------------+
| patient_id | name    | email             | mobile_no  | password    | confirm_password |
+------------+---------+-------------------+------------+-------------+------------------+
|          1 | gauri   | gauri@gmail.com   | 9730104883 | Gauri@123   | Gauri@123        |
|          2 | gayatri | gayatri@gmail.com | 1234567890 | Gayatri@123 | Gayatri@123      |
+------------+---------+-------------------+------------+-------------+------------------+

create table patient_information(name varchar(20),bloodgroup varchar(10),city varchar(20),allergy varchar(20),disease varchar(20));

+-------+------------+----------+---------+---------+
| name  | bloodgroup | city     | allergy | disease |
+-------+------------+----------+---------+---------+
| gauri | O+         | Amravati | No      | Dibetes |
+-------+------------+----------+---------+---------+