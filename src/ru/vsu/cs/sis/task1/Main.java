package ru.vsu.cs.sis.task1;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("урок как создать папку на рабочем столе", "kriper2004",
                16409, "https://youtu.be/5QZcOugHQ6s?si=EYR31YTes7FDr__N");
        video.play();
        video.pause();
    }
}