package ru.vsu.cs.sis.task1;

import ru.vsu.cs.sis.task1.bid.Bid;
import ru.vsu.cs.sis.task1.genre.Genre;
import ru.vsu.cs.sis.task1.video.Video;
import ru.vsu.cs.sis.task1.video.VideoImp;

import static ru.vsu.cs.sis.task1.Main.makeSplitter;

public class UselessTests {
    public static void main(String[] args) {
        Video video = new Video("урок как создать папку на рабочем столе", "kriper2004",
                16409, "https://youtu.be/5QZcOugHQ6s?si=EYR31YTes7FDr__N",
                new Genre("Развлекательное видео", 15));
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
