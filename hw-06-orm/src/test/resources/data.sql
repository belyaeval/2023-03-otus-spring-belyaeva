insert into author (name) values ('Пушкин');

insert into genre (name) values ('роман');

insert into book (name, author_id, genre_id) values ('Евгений Онегин', 1, 1);

insert into book_comment (text, book_id) values ('отличная', 1), ('интересная', 1);
