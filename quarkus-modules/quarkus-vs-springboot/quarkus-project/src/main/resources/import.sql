drop table if exists ZipCode;

create table ZipCode (
    zip varchar(255) not null,
    city varchar(255),
    county varchar(255),
    state varchar(255),
    timezone varchar(255),
    type varchar(255),
    primary key (zip)
) engine=MEMORY;
