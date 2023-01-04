create table player
(
    id_player serial primary key,
    name varchar(50),
    number int,
);
alter sequence have_id_have_seq restart with 4;