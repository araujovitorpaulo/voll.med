alter table pacientes add ativo tinyint;
update pacientes set ativo=1;
--alter table medicos set ativo not null;