package ru.vsu.cs.sis.task1.video;

import ru.vsu.cs.sis.task1.genre.Genre;

import java.util.List;

public class MusicalVideo extends Video implements VideoImp {
    private String artist;
    public MusicalVideo(String name, String channel, int durationInSeconds,
                        String link, Genre genre, String artist) {
        super(name, channel, durationInSeconds, link, genre);
        this.artist = artist;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getChannel() {
        return super.getChannel();
    }

    @Override
    public int getDurationInSeconds() {
        return super.getDurationInSeconds();
    }

    @Override
    public String getLink() {
        return super.getLink();
    }

    @Override
    public Genre getGenre() {
        return super.getGenre();
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void like() {
        super.like();
    }

    @Override
    public void dislike() {
        super.dislike();
    }

    @Override
    public void play() {
        System.out.println("Now plays the song '" + getName() + "' from channel '" + getChannel() + "'. It is played by artist "
                +getArtist() + " for " + getDurationInSeconds() + " seconds. Genre of this song: " + getGenre().getName() + ".");
        System.out.println("Link on this video: " + getLink());
    }
}