create database bdnomina;
use bdnomina;
CREATE TABLE usuarios
(
  id int(11) auto_increment PRIMARY KEY ,
  usuario varchar(10) ,
  password varchar(45) ,
  nombre varchar(60) ,
  email varchar(30) ,
  idTipo int(11) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table tEmpleados(
codigoE int(5) auto_increment primary key not null,
nombreE varchar(25) not null,
apellidoE varchar(25) not null,
puestoE varchar(20) not null,
sueldoE float(6) not null,
estadoE varchar(8) not null

)ENGINE=INNODB default CHARSET=LATIN1;