package ru.vsu.cs.sis.task1.genre;

public class Genre {
    private String name; //Название жанра
    private int rating; // Его рейтинг

    public Genre(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}