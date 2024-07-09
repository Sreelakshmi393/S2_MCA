create database job;
use job;

create table emp_salary(emp_id varchar(25) primary key, emp_name varchar(25), no_of_working_days int, designation varchar(25), salary int);
desc emp_salary;

insert into emp_salary values("e001", "Anu", 15, "Assistant Professor", 25000), ("e002", "Syam", 20, "Clerk", 2000), ("e003", "Athul", 25, "Programmer", 30000);
select * from emp_salary;

set sql_safe_updates=0;
update emp_salary set salary=0;

call CalculateEmpSalary();

1. Write a stored procedure using cursor to calculate salary of each employee. Consider an
Emp_salary table have the following attributes emp_id, emp_name, no_of_working_days,
designation and salary. 