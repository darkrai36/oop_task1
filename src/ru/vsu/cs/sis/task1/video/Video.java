package ru.vsu.cs.sis.task1.video;

import ru.vsu.cs.sis.task1.genre.Genre;

public class Video {
    private String name;//Название видео
    private String channel;
    private int durationInSeconds; //Длительность в секундах
    private String link;//Ссылка на видео
    private Genre genre;


    public Video(String name, String channel, int durationInSeconds, String link, Genre genre) {
        this.name = name;
        this.channel = channel;
        this.durationInSeconds = durationInSeconds;
        this.link = link;
        this.genre = genre;
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

    public void play() {
        System.out.println("Now plays: '" + name + "' from channel '" + channel + "'. It plays "
                + durationInSeconds + " seconds. Genre of this video: " + genre.getName() + ".");
        System.out.println("Link on this video: " + link);
    }

    public void pause() {
        System.out.println("You get a pause. Please, tap on 'Play' again to continue watch video!");
    }
    public void like() {
        System.out.println("Thanks for watching our video!");
    }
    public void dislike() {
        System.out.println("Oh, that's so sad.... ;(");
    }
}