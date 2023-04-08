
CREATE TABLE ads
(
    id            bigint generated by default as identity
        primary key,
    description   varchar(255),
    price         integer not null,
    title         varchar(255),
    author_id     bigint,
    user_image_id bigint
);

create table comment
(
    pk              integer generated by default as identity
        primary key,
    created_at      timestamp,
    text            varchar(255),
    id              bigint,
    first_name      bigint,
    author_image_id bigint
);

create table image
(
    id         bigserial PRIMARY KEY,
    file_size  bigint,
    media_type varchar(1000),
    data       bytea
);

create table users
(
    id         bigserial PRIMARY KEY,
    email      varchar(50),
    password   varchar(250),
    first_name varchar(50),
    last_name  varchar(50),
    phone      varchar(50),
    image_id   bigint REFERENCES image(id),
    role       varchar(255),
    city       varchar(255),
    reg_date   timestamp with time zone
);
