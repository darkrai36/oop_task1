package ru.vsu.cs.sis.task1;

public class Video {
    private String name;//Название видео
    private String author;
    private int durationInSeconds; //Длительность в секундах
    private String link;//Ссылка на видео
    private Genre genre;


    public Video(String name, String author, int durationInSeconds, String link, Genre genre) {
        this.name = name;
        this.author = author;
        this.durationInSeconds = durationInSeconds;
        this.link = link;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {return author;}
    public int getDurationInSeconds() {
        return durationInSeconds;
    }
    public String getLink() {
        return link;
    }
    public Genre getGenre() {return genre;}

    public void play() {
        System.out.println("Now plays: '" + name + "' from " + author + ". It plays " + durationInSeconds + " seconds.");
        System.out.println("Link on this video: " + link);
    }

    public void pause() {
        System.out.println("You get a pause. Please, tap on 'Play' again to continue watch video!");
    }
}