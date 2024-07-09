create database tech;
use tech;

create table technician (techID varchar(25) primary key, techName varchar(25), salary int, place varchar(25));
desc technician;

insert into technician values('t001','Rahul', 10000, 'TVM'),('t002','Ram',8000,'Kollam');
select * from technician;

CREATE TEMPORARY TABLE temp_technician (techID VARCHAR(25),techName VARCHAR(25));
call techDisplay();