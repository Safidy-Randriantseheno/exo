create table play_against
(
    id_play_against serial primary key,
    datetime date,
    stadium varchar,
    id_team_one int references team(id_team),
    id_team_two int references team(id_team),
);
