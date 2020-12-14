create database university;
use university;
create table users(
id int unsigned NOT NULL AUTO_INCREMENT,
primary key(id),
fname varchar(40) NOT NULL,
lname varchar(40) NOT NULL,
dob varchar(40) NOT NULL,
gender varchar(40) NOT NULL,
cntno varchar(40) NOT NULL,
email varchar(200) NOT NULL,
username varchar(50) NOT NULL,
password varchar(50) NOT NULL,
q1 text NOT NULL,
ans1 text  NOT NULL,
q2 text NOT NULL,
ans2 text  NOT NULL,
q3 text NOT NULL,
ans3 text  NOT NULL,
UNIQUE KEY(username)
);

create table admin(
username varchar(45) NOT NULL,
password varchar(45) NOT NULL
);
insert into admin values('admin','admin');


create table event(
id int NOT NULL AUTO_INCREMENT,
event_name varchar(50) NOT NULL,
event_descr text NOT NULL,
dateofevent varchar(45) NOT NULL,
addrs text NOT NULL,
phone varchar(45) NOT NULL,
email varchar(45) NOT NULL,
rules text NOT NULL,
primary key(id));


create table club(
id int NOT NULL AUTO_INCREMENT,
club_name varchar(50) NOT NULL,
club_descr text NOT NULL,
primary key(id));

create table club_event(
id int NOT NULL ,
event_name varchar(50) NOT NULL,
event_descr text NOT NULL,
dateofevent varchar(45) NOT NULL,
addrs text NOT NULL,
phone varchar(45) NOT NULL,
email varchar(45) NOT NULL,
rules text NOT NULL);

create table club_story(
id int NOT NULL ,
event_name varchar(50) NOT NULL,
event_descr text NOT NULL
);

create table event_info(
id varchar(50) NOT NULL,
username varchar(50) NOT NULL,
complaint text,
intreseted varchar(50),
likedislike varchar(50),
attnedance varchar(50)
);

create table idea_db(
id int NOT NULL auto_increment,
uname varchar(50),
post_title text,
post_descr text,
post_dt varchar(50),
posvote varchar(50),
negvote varchar(50),
primary key(id)
);

create table suggestions(
id int NOT NULL auto_increment,
username varchar(50),
problem text,
subcat text,
problemtitle text,
problemdescr text,
postdt text,
usersuggestion text,
adminsuggest text,
status text,
primary key(id)
);

create table joined_groups(
id int NOT NULL auto_increment,
username varchar(50) NOT NULL,
groupname varchar(50) NOT NULL,
status varchar(50),
primary key(id),
unique(username)
);


create table joined_service(
id int NOT NULL auto_increment,
username varchar(50) NOT NULL,
servicename varchar(50) NOT NULL,
status varchar(50),
primary key(id),
unique(username)
);

create table service(
id int NOT NULL AUTO_INCREMENT,
event_name varchar(50) NOT NULL,
event_descr text NOT NULL,
dateofevent varchar(45) NOT NULL,
addrs text NOT NULL,
phone varchar(45) NOT NULL,
email varchar(45) NOT NULL,
rules text NOT NULL,
primary key(id)); 

CREATE TABLE user (
id int NOT NULL AUTO_INCREMENT,
issue varchar(10) NOT NULL,
description varchar(50) NOT NULL,
dates timestamp NULL DEFAULT CURRENT_TIMESTAMP,
sol varchar(50) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=324229 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


create table comment(
id int NOT NULL,
uname varchar(50) NOT NULL,
descr text,
primary key(id)
);
