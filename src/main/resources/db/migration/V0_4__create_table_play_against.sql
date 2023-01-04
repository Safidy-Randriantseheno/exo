create table play_against
(
    id_play_against serial primary key,
    datetime date,
    stadium varchar
);
alter sequence have_id_have_seq restart with 4;