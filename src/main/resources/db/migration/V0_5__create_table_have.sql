create table have
(
    have  primary key,
    id_team int references team(id_team),
    id_sponsor int references sponsor(id)

);
alter sequence have_id_have_seq restart with 4;