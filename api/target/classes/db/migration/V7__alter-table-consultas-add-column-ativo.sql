alter table consultas add ativo tinyint;
update consultas set ativo=1;
--alter table medicos set ativo not null;