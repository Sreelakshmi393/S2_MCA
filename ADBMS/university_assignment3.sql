use university;

desc course;
desc section;
alter table section add primary key(section_identifier);
desc student;
# 2. QUERIES TO INSERT VALUES IN ALL THE FIVE TABLES
create table grade_report(student_number varchar(11), section_identifier varchar(11), grade varchar(11), primary key(student_number, section_identifier),foreign key(student_number) references student(student_number), foreign key(section_identifier) references section(section_identifier));
desc grade_report;

create table prerequisite(course_number varchar(11),prerequisite_number varchar(11), primary key(course_number, prerequisite_number), foreign key(course_number) references course(course_number), foreign key(prerequisite_number) references course(course_number));
desc prerequisite;

insert into student VALUES('Smith',17, 1, 'CS');
insert into student VALUES('Brown',8, 2, 'CS');

insert into course values('Intro to computer science','CS1310',4,'CS');
insert into course values('Data structures','CS3320',4,'CS');
insert into course values('Discrete Mathemeatics','MATH2410',3,'MATH');
insert into course values('Database','CS3380',3,'CS');

insert into section values(85,'MATH2410','Fall','07','King');
insert into section values(92,'CS1310','Fall','07','Anderson');
insert into section values(102,'CS3320','Spring','08','Knuth');
insert into section values(112,'MATH2410','Fall','08','Chang');
insert into section values(119,'CS1310','Fall','08','Anderson');
insert into section values(135,'CS3380','Fall','08','Stone');

insert into grade_report values(17,112,'B');
insert into grade_report values(17,119,'C');
insert into grade_report values(8,85,'A');
insert into grade_report values(8,92,'A');
insert into grade_report values(8,102,'B');
insert into grade_report values(8,135,'A');

SELECT * FROM grade_report;

insert into prerequisite values('CS3380','CS3320');
insert into prerequisite values('CS3380','MATH2410');
insert into prerequisite values('CS3380','CS1310');

#3.RETRIVE THE LIST OF ALL COURSES AND GRADES OF SMITH

