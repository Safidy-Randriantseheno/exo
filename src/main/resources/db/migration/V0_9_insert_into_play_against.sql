insert into play_against (id_play_against, datetime, stadium)
values (4, '2003-9-3', 'BAREA');
insert into play_against (id_play_against, datetime, stadium)
values (1, '2003-3-3', 'BAREA');
insert into play_against (id_play_against, datetime, stadium)
values (7, '2003-8-3', 'BAREA')
;
alter sequence play_against_id_play_against_seq restart with 4;