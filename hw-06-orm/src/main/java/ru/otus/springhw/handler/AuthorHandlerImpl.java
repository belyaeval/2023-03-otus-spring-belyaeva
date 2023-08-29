package ru.otus.springhw.handler;

import org.springframework.stereotype.Component;
import ru.otus.springhw.domain.Author;

@Component
public class AuthorHandlerImpl implements AuthorHandler {
    @Override
    public Author createAuthor(long id, String name) {
        return new Author(id, name);
    }

    @Override
    public Author createAuthor(String name) {
        return new Author(name);
    }
}
