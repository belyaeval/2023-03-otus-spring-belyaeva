package ru.otus.springhw.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Genre {
    private long id;

    private String name;

    public Genre(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Genre(String name) {
        this.name = name;
    }
}
