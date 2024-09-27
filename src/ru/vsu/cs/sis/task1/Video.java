package ru.vsu.cs.sis.task1;

public class Video {
    private String name; //Название видео
    private int durationInSeconds; //Длительность в секундах
    private String link; //Ссылка на видео

    public Video(String name, int durationInSeconds, String link) {
        this.name = name;
        this.durationInSeconds = durationInSeconds;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public void play() {
        System.out.println("Now plays: " + name.toString() + ". It plays " + durationInSeconds + "seconds.");
    }
    public void pause() {
        System.out.println("You get a pause. Please, tap on 'Play' again to continue watch video!");
    }
}
