CREATE DEFINER=`root`@`localhost` PROCEDURE `CalculateEmpSalary`()
BEGIN
	declare done int default false;
    declare empid varchar(25);
    declare workingDays int;
    declare position varchar(25);
    declare salary int;
    declare employeeCursor cursor for
    select emp_id, no_of_working_days, designation, salary from emp_salary;
    declare continue handler for not found set done=True;
    open employeeCursor;
    read_loop: LOOP
    fetch employeeCursor into empid, workingDays, position, salary;
    if done
    then
    leave read_loop;
    end if;
    if position="Assistant Professor"
    then
    set salary = workingDays*1750;
    elseif position="Clerk"
    then
    set salary = workingDays*750;
    else
    set salary = workingDays*1250;
    end if;
    update emp_salary set salary=salary where emp_id=empid;
    end LOOP;
    close employeeCursor;
END
