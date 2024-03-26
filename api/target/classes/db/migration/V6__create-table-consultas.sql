create table consultas(

    id bigint not null auto_increment,
    nomepaciente varchar(100) not null,
    nomemedico varchar(100) not null,
    data varchar(10) not null,
    hora varchar(10) not null,

    primary key(id)
);