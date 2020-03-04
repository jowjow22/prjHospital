drop database if exists db_hospital;

create database if not exists db_hospital;

use db_hospital;

create table tb_hospital(
cd_hospital int not null auto_increment,
nm_hospital varchar(45),
ds_endereco varchar(100),
primary key(cd_hospital)
);

create table tb_paciente(
cd_paciente int not null auto_increment,
nm_paciente varchar(50),
nr_cpf varchar(14) not null,
nr_rg varchar(20),
nr_idade int,
ds_senha varchar(45),
id_hospital int,
primary key(cd_paciente),
foreign key(id_hospital) references tb_hospital(cd_hospital)
);


create table tb_funcionario(
cd_funcionario int not null auto_increment,
nm_fucionario varchar(50),
nr_cpf varchar(14) not null,
nr_rg varchar(20),
nr_idade int,
ds_senha varchar(45),
vl_hora decimal(5,2),
id_hospital int,
primary key(cd_funcionario),
foreign key(id_hospital) references tb_hospital(cd_hospital)
);

create table tb_medico(
cd_medico int not null auto_increment,
nr_crm varchar(45),
ds_especialidade varchar(45),
id_funcionario int,
primary key(cd_medico),
foreign key(id_funcionario) references tb_funcionario(cd_funcionario)
);

create table tb_enfermeiro(
cd_enfermeiro int not null auto_increment,
nr_corem varchar(45),
id_funcionario int,
primary key(cd_enfermeiro),
foreign key(id_funcionario) references tb_funcionario(cd_funcionario)
);

create table tb_prontoSocorro(
cd_prontoSocorro int not null auto_increment,
ds_endereco varchar(100),
id_hospital int,
primary key(cd_prontoSocorro),
foreign key(id_hospital) references tb_hospital(cd_hospital)
);