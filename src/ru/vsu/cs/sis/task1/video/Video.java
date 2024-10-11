package ru.vsu.cs.sis.task1.video;

import ru.vsu.cs.sis.task1.genre.Genre;

import java.util.ArrayList;
import java.util.List;

public class Video implements VideoImp {
    //TODO 1) Для этого класса можно сделать возможность создания плейлиста. А может, и перенести это все в отдельный класс...
    private String name;
    private String channel;
    private int durationInSeconds;
    private String link;
    private Genre genre;
    private List<String> comments;
    private static List<Video> playlist;

    static {
        playlist = new ArrayList<>();
    }

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
    public static List<Video> getPlaylist() {
        return playlist;
    }
    public static void addVideoToPlaylist(Video video) {
        playlist.add(video);
    }

    public static void playlistToString(List<Video> playlist) {
        for (Video video : playlist) {
            System.out.println("Video: " + video.getName() + ", from channel " + video.getChannel());
        }
    }

    @Override
    public void play() {
        System.out.println("Now plays: '" + getName() + "' from channel '" + getChannel() + "'. It plays "
                + getDurationInSeconds() + " seconds. Genre of this video: " + getGenre().getName() + ".");
        System.out.println("Link on this video: " + getLink());
    }
}