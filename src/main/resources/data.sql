insert into angler_paradise.users (id, created_on, modified_on, email, first_name, last_name, password, username)
values (1, now(), null, 'admin@admin.com', 'admin', 'adminov',
        'a4bdafdc86779980e8a1b786cfb754e800f080fdf3d0708c0663633dabf29c94b2b438fb265db7d6', 'admin');

insert into angler_paradise.users (id, created_on, modified_on, email, first_name, last_name, password, username)
values (2, now(), null, 'pesho@abv.com', 'pesho', 'petrov',
        'a4bdafdc86779980e8a1b786cfb754e800f080fdf3d0708c0663633dabf29c94b2b438fb265db7d6', 'pesho');

insert into angler_paradise.user_roles(id, role)
VALUES (1, 'ADMIN');

insert into angler_paradise.user_roles(id, role)
VALUES (2, 'USER');

insert into angler_paradise.users_roles(user_entity_id, roles_id)
VALUES (1, 1),
       (2, 2);


insert into angler_paradise.dam_types
values (1, 'FREE');
insert into angler_paradise.dam_types
values (2, 'PAID');

insert into angler_paradise.dams
values (1, now(), null, 'Язовир Въча е разположен в Родопи планина. Един от най-големите язовири в България',
        'asdasdasd', '/images/vacha.jpg', 'Въча', 1);

insert into angler_paradise.dams
values (2, now(), null, 'Язовир Пясъчник е разположен в близост до град Пловдив.',
        'asdasdasd', '/images/dam.jpg', 'Пясъчник', 1);

insert into angler_paradise.dams
values (3, now(), null, 'Язовир Борец е разположен в близост до град Раковски.Предпочитан от много за спортен риболов',
        'asdasdasd', '/images/dam1.jpeg', 'Борец', 2);
