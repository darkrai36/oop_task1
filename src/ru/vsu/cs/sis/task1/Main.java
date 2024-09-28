package ru.vsu.cs.sis.task1;

public class Main {
    public static void makeSplitter() {
        System.out.println("===============================================");
    }
    public static void main(String[] args) {
        Video video = new Video("урок как создать папку на рабочем столе", "kriper2004",
                16409, "https://youtu.be/5QZcOugHQ6s?si=EYR31YTes7FDr__N");
        video.play();
        makeSplitter();

        video.pause();
        makeSplitter();

        Bid bid = new Bid("x.com", 67, "кто прочитал тот хороший человек");
        bid.printMessage();
        makeSplitter();

        Bid importantBid = new Bid("vk.com", 658938, "заходит улитка в бар...");
        importantBid.printMessage();
        makeSplitter();
    }
}