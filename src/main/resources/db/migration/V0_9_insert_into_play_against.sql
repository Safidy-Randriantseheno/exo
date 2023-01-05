insert into play_against (id_play_against, datetime, stadium, id_team_one, id_team_two)
values (4, '2003-9-3', 'BAREA', 1, 3);
insert into play_against (id_play_against, datetime, stadium, id_team_one, id_team_two)
values (1, '2003-3-3', 'BAREA', 3, 2);
insert into play_against (id_play_against, datetime, stadium, id_team_one, id_team_two)
values (7, '2003-8-3', 'BAREA', 1, 2)
;
alter sequence play_against_id_play_against_seq restart with 4;