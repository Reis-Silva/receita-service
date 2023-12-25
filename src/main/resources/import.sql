-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into receita (id, tipo, informacoes, assinatura, cid) values(1, 'RECEITA', 'Receita Levitaceram 12h/12h', 'Doctor X', "00001");
insert into receita (id, tipo, informacoes, assinatura, cid) values(2, 'RECEITA', 'Receita Levitaceram 12h/12h', 'Doctor y', "00002");
insert into receita (id, tipo, informacoes, assinatura, cid) values(3, 'RECEITA', 'Receita Levitaceram 12h/12h', 'Doctor z', "00003");