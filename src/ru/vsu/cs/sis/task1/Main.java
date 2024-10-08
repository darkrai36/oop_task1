package ru.vsu.cs.sis.task1;

import ru.vsu.cs.sis.task1.advertisement.Advertisement;
import ru.vsu.cs.sis.task1.genre.Genre;
import ru.vsu.cs.sis.task1.video.MusicalVideo;
import ru.vsu.cs.sis.task1.video.Video;
import java.util.Scanner;

public class Main {
    public static void makeSplitter() {
        System.out.println("===============================================");
    }

    public static void main(String[] args) {
        MusicalVideo musicalVideo = new MusicalVideo("Польская корова", "Polish memes", 123,
                "https://youtube.com", new Genre("Music", 38), "rammstein");
        musicalVideo.play();
        musicalVideo.addComment(musicalVideo.getComments());
        System.out.println(musicalVideo.getComments());
        makeSplitter();
        musicalVideo.dislike();

        Advertisement firstAd = new Advertisement("VK", "This is our ad. Would you like it?",
                "vk.com", 45, 499);
        firstAd.orderAd();
        makeSplitter();

        Advertisement second = new Advertisement("adad", "adasd", "vk.com", 45, 499);
        second.orderAd();
        second.skipAd();
        makeSplitter();

        Video f = new Video("nwho-ho-ho", "Gyro", 545, "www.youtube.com",
                new Genre("JOJO", 100));
        Scanner scanner = new Scanner(System.in);
        f.addComment(f.getComments());
        System.out.println(f.getComments());
        makeSplitter();
    }
}