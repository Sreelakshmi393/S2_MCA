create database sailors;
use sailors;

create table sale(sid int, sname varchar(25), rating int, age int);
alter table sale add primary key(sid);
insert into sale values(22,'Dustin',7,45),(29,'Brutas',1,8),(31,'Lubber',8,55),(32,'Andy',8,25),(58,'Rusty',10,35);

create table boats(bid int primary key, bname varchar(25), color varchar(25));
insert into boats values(101,'Interlake','Blue'),(102,'Interlake','Red'),(103,'Clipper','Green'),(104,'Marine','Red');

create table reserves(sid int, bid int, day date, foreign key(sid) references sale(sid), foreign key(bid) references boats(bid), primary key(sid,bid));
insert into reserves values(22,101,'1998-10-10'),(22,102,'1998-10-10'),(22,103,'1998-08-10');

desc sale;
desc boats;
desc reserves;

select * from sale;
select * from boats;
select * from reserves;

select sname,age from sale;

select s.sid,s.sname from sale s join reserves r on r.sid=s.sid join boats b on b.bid=r.bid where b.bid=101;

select sname from sale where rating>7;

select s.sname from sale s join reserves r on r.sid=s.sid join boats b on b.bid=r.bid where b.bid=103;

update sale set age=33 where sname="Brutas";
select sname, age from sale where age=(select min(age) from sale);

insert into sale values(60,"Andy",8,44);
select sname, count(*) as number from sale group by sname;

select avg(age) as avg_age from sale;