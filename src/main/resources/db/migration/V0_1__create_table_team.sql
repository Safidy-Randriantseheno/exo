create table team
(
    id_team serial primary key,
    name varchar(50)
);
alter sequence have_id_have_seq restart with 4;