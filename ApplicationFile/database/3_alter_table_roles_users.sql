use toeiconline;

alter table users add column roleid bigint;

alter table users add constraint fk_users_roles foreign key (roleid) references roles(roleid);