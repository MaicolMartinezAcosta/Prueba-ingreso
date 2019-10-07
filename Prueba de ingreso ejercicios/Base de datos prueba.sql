create database Sistema_ventas;
use Sistema_ventas;


create table productos(
id_producto int auto_increment primary key,
nombre_producto varchar(60) not null,
cantidad int not null,
valor_compra bigint not null,
valor_Venta bigint not null,
estado enum('En venta','Agotado')
);
insert into productos values ('1','Leche',50,50000,2000,'En venta');
insert into productos values ('2','arroz',100,60000,3000,'En venta');


create table vendedor(
id_vendedor varchar(20) primary key,
nombre_vendedor varchar(20) not null
);
insert into vendedor values ('11935244','Maicol');


create table factura (
nume_factura int auto_increment primary key,
fecha_factura date,
id_vendedor varchar(20) not null,
id_producto int not null,
catidad int,
valor_total bigint not null
);

insert into factura values ('1','2019/10/07','11935244',1,5,10000);
insert into factura values ('2','2019/10/07','11935244',1,5,10000);
insert into factura values ('3','2019/10/07','11935244',2,6,12000);




select f.nume_factura,p.id_producto,p.nombre_producto,p.cantidad ,p.valor_compra,f.valor_total,  f.valor_total - p.valor_compra as Ganancias from factura f inner join productos p on f.id_producto = p.id_producto where f.id_producto = '2';

ALTER TABLE factura add foreign key (id_vendedor) references vendedor (id_vendedor);
ALTER TABLE factura add foreign key (id_producto) references productos (id_producto);




