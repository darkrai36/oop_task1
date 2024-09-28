package ru.vsu.cs.sis.task1;

public class MusicalVideo extends Video {
    private String artist;
    public MusicalVideo(String name, String channel, int durationInSeconds, String link, Genre genre, String artist) {
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
    public void play() {
        System.out.println("Hey, users! Now plays song '" + getName() + "' by " + getArtist());
    }

    @Override
    public void pause() {
        super.pause();
    }
}