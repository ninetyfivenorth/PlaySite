# User schema
 
# --- !Ups

CREATE TABLE users (
    id integer NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    email varchar(255) not null,
    password varchar(255) not null
);
 
# --- !Downs
 
DROP TABLE users;

