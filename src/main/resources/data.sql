insert into angler_paradise.users (id, created_on, modified_on, email, first_name, last_name, password, username)
values (1,now(),null, 'admin@admin.com', 'admin','adminov',
        'a4bdafdc86779980e8a1b786cfb754e800f080fdf3d0708c0663633dabf29c94b2b438fb265db7d6','admin');

insert into angler_paradise.users (id, created_on, modified_on, email, first_name, last_name, password, username)
values (2,now(),null, 'pesho@abv.com', 'pesho','petrov','a4bdafdc86779980e8a1b786cfb754e800f080fdf3d0708c0663633dabf29c94b2b438fb265db7d6','pesho');

insert into angler_paradise.user_roles(id, role)
VALUES (1,'ADMIN');

insert into angler_paradise.user_roles(id, role)
VALUES (2,'USER');

insert into angler_paradise.users_roles(user_entity_id, roles_id) VALUES (1,1),(2,2);