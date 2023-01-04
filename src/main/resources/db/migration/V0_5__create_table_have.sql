create table have
(
    id_have  serial primary key,
    id_team int references team(id_team),
    id_sponsor int references sponsor(id_sponsor)

);
