create table address (
    add_id int auto_increment primary key,
    line1 varchar_ignorecase(50) not null,
    line2 varchar_ignorecase(50) not null
);
create table item_deatils(
    item_id int auto_increment primary key,
    item_name varchar_ignorecase(50) not null,
    item_quantity int not null,
    item_price_unit int not null
);

create table flash_sale_details(
    fs_id int auto_increment primary key,
    fs_name varchar_ignorecase(50) not null,
    fs_date_starts date not null,
    fs_date_ends   date not null, 
    fs_item_count int not null,
    fs_offer_price int not null,
    item_id int, 
    CONSTRAINT FK_flash_sale_details_item_deatils FOREIGN KEY(item_id) REFERENCES item_deatils(item_id)
);
create table FS_REGISTERED_USER(
    reg_user_id int auto_increment primary key,  
    reg_user_name varchar_ignorecase(50) not null,
    add_id int,
    fs_id int,
    CONSTRAINT FK_FS_REGISTERED_USER_address FOREIGN KEY(add_id) REFERENCES address(add_id),
    CONSTRAINT FK_FS_REGISTERED_USER_flash_sale_details FOREIGN KEY(fs_id) REFERENCES flash_sale_details(fs_id)
);
create table fs_purchase_orders(
     id int auto_increment primary key,
     purchase_order_date DATE NOT NULL,
     order_count int NOT NULL,
     fs_id int,
     reg_user_id int,
     CONSTRAINT FK_fs_purchase_orders_flash_sale_details FOREIGN KEY(fs_id) REFERENCES flash_sale_details(fs_id),
     CONSTRAINT FK_fs_purchase_orders_FS_REGISTERED_USER FOREIGN KEY(reg_user_id) REFERENCES FS_REGISTERED_USER(reg_user_id)
);