
DROP table IF EXISTS cliente;

create table cliente(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(250),
	dni integer,
	trabajo varchar(250),
	fecha date,
	salario integer
);

insert into cliente (nombre, apellido,direccion,dni,fecha, salario)values('Jose','Marin','calle imaginaria 1',123456789, NOW(),0);
insert into cliente (nombre, apellido,direccion,dni,fecha, salario)values('Juan','Lopez','calle imaginaria 2',122222222, NOW(),0);
insert into cliente (nombre, apellido,direccion,dni,fecha, salario)values('Pedro','Guillem','calle imaginaria 3',123333333, NOW(),0);
insert into cliente (nombre, apellido,direccion,dni,fecha, salario)values('Jordi','Martin','calle imaginaria 4',123444444, NOW(),0);
insert into cliente (nombre, apellido,direccion,dni,fecha, salario)values('Jonatan','Vicente','calle imaginaria 5',123455555, NOW(),0);
insert into cliente (nombre, apellido,direccion,dni,fecha, salario, trabajo)values('uri','lopez','calle la canya',123455666, NOW(),0,'PROGRAMADOR' );