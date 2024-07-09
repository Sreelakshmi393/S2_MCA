CREATE DEFINER=`root`@`localhost` PROCEDURE `techDisplay`()
BEGIN
	declare done int default false;
    declare tid varchar(25);
    declare tname varchar(25);
    declare techCursor cursor for select techId, techName from technician;
    declare continue handler for not found set done=True;
    open techCursor;
    read_loop:LOOP
    fetch techCursor into tid, tname;
    if done
    then
    leave read_loop;
    end if;
    INSERT INTO temp_technician (techID, techName) VALUES (tid, tname);
    END LOOP;
    close techCursor;
	SELECT techID AS Technician_ID, techName AS Technician_Name FROM temp_technician;
	delete from temp_technician;
END