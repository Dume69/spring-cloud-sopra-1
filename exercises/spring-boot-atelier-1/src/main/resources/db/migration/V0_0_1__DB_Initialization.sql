create table invoice (id integer not null auto_increment, date datetime, primary key (id));
create table invoice_detail (id integer not null auto_increment, quantity double precision not null, tax_rate double precision not null, unit_price double precision not null, invoice_id integer, product_ean13 varchar(255), primary key (id));
create table product (ean13 varchar(255) not null, description varchar(255), name varchar(255), price double precision not null, tax_rate double precision not null, primary key (ean13));

alter table invoice_detail add constraint FKit1rbx4thcr6gx6bm3gxub3y4 foreign key (invoice_id) references invoice (id);
alter table invoice_detail add constraint FKdfh10r7yvasbml9570xlc7s7t foreign key (product_ean13) references product (ean13);