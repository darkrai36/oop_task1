package ru.vsu.cs.sis.task1.video;

import ru.vsu.cs.sis.task1.genre.Genre;

import java.util.ArrayList;
import java.util.List;

public class Video implements VideoImp {
    private String name;
    private String channel;
    private int durationInSeconds;
    private String link;
    private Genre genre;
    private List<String> comments;


    public Video(String name, String channel, int durationInSeconds, String link, Genre genre) {
        this.name = name;
        this.channel = channel;
        this.durationInSeconds = durationInSeconds;
        this.link = link;
        this.genre = genre;
        this.comments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getChannel() {return channel;}

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public String getLink() {
        return link;
    }

    public Genre getGenre() {return genre;}

    public List<String> getComments() {
        return comments;
    }

    @Override
    public void play() {
        System.out.println("Now plays: '" + getName() + "' from channel '" + getChannel() + "'. It plays "
                + getDurationInSeconds() + " seconds. Genre of this video: " + getGenre().getName() + ".");
        System.out.println("Link on this video: " + getLink());
    }
}