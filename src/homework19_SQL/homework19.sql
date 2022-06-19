create table people
(
    id_person  int primary key,
    name       varchar,
    gender     varchar,
    birth_date date
);

create table hobbies
(
    id_hobby   int primary key,
    name_hobby varchar,
    id_type    int,
    constraint fk_id_type foreign key (id_type) references types_hobbies (id_type)
);

create table types_hobbies
(
    id_type int primary key,
    type    varchar
);

create table hobby_assignment
(
    id_assignment int primary key,
    id_person     int,
    id_hobby      int,
    constraint fk_person_id foreign key (id_person) references people (id_person),
    constraint fk_hobby_id foreign key (id_hobby) references hobbies (id_hobby)
);

insert into people (id_person, name, gender, birth_date)
values (1, 'Person1', 'male', '1978-01-29'),
       (2, 'Person2', 'female', '1988-04-01'),
       (3, 'Person3', 'male', '1981-07-03'),
       (4, 'Person4', 'female', '1998-10-15'),
       (5, 'Person5', 'female', '1971-12-25'),
       (6, 'Person6', 'male', '1980-08-08'),
       (7, 'Person7', 'female', '1985-06-19'),
       (8, 'Person8', 'male', '1970-12-24'),
       (9, 'Person9', 'male', '1983-01-06'),
       (10, 'Person10', 'female', '1988-05-05');

insert into types_hobbies (id_type, type)
values (1, 'active'),
       (2, 'calm');

insert into hobbies (id_hobby, name_hobby, id_type)
values (1, 'basketball', 1),
       (2, 'football', 1),
       (3, 'hockey', 1),
       (4, 'chess', 2),
       (5, 'tennis', 1),
       (6, 'crosswords', 2),
       (7, 'reading', 2),
       (8, 'sleeping', 2),
       (9, 'walking', 1),
       (10, 'cycling', 1),
       (11, 'boxing', 1),
       (12, 'mathematics', 2);

insert into hobby_assignment (id_assignment, id_person, id_hobby)
values (1, 1, 1),
       (2, 1, 2),
       (3, 2, 3),
       (4, 2, 4),
       (5, 3, 5),
       (6, 3, 6),
       (7, 4, 7),
       (8, 4, 8),
       (9, 5, 9),
       (10, 5, 10),
       (11, 6, 11),
       (12, 6, 12),
       (13, 7, 1),
       (14, 7, 2),
       (15, 8, 3),
       (16, 8, 4),
       (17, 9, 5),
       (18, 9, 6),
       (19, 1, 7),
       (20, 10, 8);

/*Удаление таблиц*/
drop table hobby_assignment, hobbies, types_hobbies, people;

/*Вывести всех людей старше какого-либо возраста*/
select people.name, people.birth_date
from people
where (CURRENT_DATE - birth_date) / 365 > 40
order by birth_date;

/*Вывести сколько людей каждого пола есть в бд*/
select gender, count(*)
from people
group by gender;

/*Вывести информацию о людях и их хобби*/
select p.name, h.name_hobby
from people as p
         join hobby_assignment ha on p.id_person = ha.id_person
         join hobbies h on h.id_hobby = ha.id_hobby
order by p.name;

/*Вывести список людей у которых более одного хобби*/
select p.name
from people as p
         join hobby_assignment ha on p.id_person = ha.id_person
group by name
having count(*) > 1
order by name;

/*Вывести список людей у которых только пассивные хобби*/
/*(это не получается сделать)*/
-- select p.name
-- from people as p
--          join hobby_assignment ha on p.id_person = ha.id_person
--          join hobbies h on h.id_hobby = ha.id_hobby
-- where h.id_type = 2
-- group by name;

/*Вывести какое количество активных хобби и пассивных хобби есть в бд*/
select th.type, count(*)
from types_hobbies as th
         join hobbies h on th.id_type = h.id_type
group by th.type
order by th.type;

/*Вывести информацию какое хобби активное, а какое пассивное*/
select h.name_hobby, th.type
from hobbies as h
         join types_hobbies th on h.id_type = th.id_type;
