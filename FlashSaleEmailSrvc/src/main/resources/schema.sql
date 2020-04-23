create table address (
    add_id int auto_increment primary key,
    line1 varchar_ignorecase(50) not null,
    line2 varchar_ignorecase(50) not null
);

create table users(
    ID int auto_increment primary key,
    username varchar_ignorecase(50) not null,
    emailaddress varchar_ignorecase(50) not null,
    add_id int,
     CONSTRAINT FK_users_address FOREIGN KEY(add_id) REFERENCES address(add_id)
);

