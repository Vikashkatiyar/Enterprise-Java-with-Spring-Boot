show databases;
use student;
show tables;
create table student(stud_id INT,stud_name VARCHAR(50),marks INT);
insert into student (stud_id,stud_name,marks) values (1,'Navin', 70);
insert into student (stud_id,stud_name,marks) values (2,'Wasim',90) ,(3, 'Nagesh',80),(4,'Sandy',85);
select stud_name from student;
select stud_id,stud_name,marks from student;
select * from student;
select * from student where marks>=80;
select marks from student;
select min(marks) from student;
select max(marks) from student;
select sum(marks) from student;
select stud_name from student where marks=(select min(marks) from student);
select stud_name from student where marks=(select max(marks) from student);
select * from student;


SET SQL_SAFE_UPDATES = 0;
update student set marks=79 where stud_id=1;
alter table student add column tech varchar(20);
update student set tech ="JAVA";
update student set tech="c++" where stud_name='Wasim';
select * from student;
delete from student where stud_id=1;
drop table student ;
show tables;
drop database student;
-- NEW PROTION START
create database iNeuron;
show databases;
use ineuron;
create table course(c_id INT,c_name varchar(20),mentor varchar(20),duration int,primary key(c_id));
show tables;
create table student(s_id INT,s_name VARCHAR(20),c_id int,assign int,
foreign key(c_id) references course(c_id));
select * from course;
insert into course values(101,'JAVA','Nitin',8),(102,'JS','Hitesh',6),(103,'DS','Krish',6);
insert into student values(1,'MOHIT',101,3),(2,'Shivani',102,6),(3,'Kishan',101,4),(
4,'GRS',102,7);
select * from student where c_id=(select c_id from course where c_name='JAVA');
select * from student where c_id in( select c_id from course where c_name like '%S');
select * from student order by s_name desc;

select s_name,c_name 
from student,course where student.c_id=course.c_id;

































