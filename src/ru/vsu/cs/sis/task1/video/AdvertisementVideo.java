package ru.vsu.cs.sis.task1.video;

import ru.vsu.cs.sis.task1.genre.Genre;

public class AdvertisementVideo extends Video {
    private String company;

    public AdvertisementVideo(String name, String channel, int durationInSeconds, String link, Genre genre, String company) {
        super(name, channel, durationInSeconds, link, genre);
        this.company = company;
    }

    @Override
    public void play() {
        System.out.println("Playing advertisement for " + company + ": " + super.getName() + " (" + super.getGenre().getName() + ") for " + super.getDurationInSeconds() + " seconds.");
    }
}
