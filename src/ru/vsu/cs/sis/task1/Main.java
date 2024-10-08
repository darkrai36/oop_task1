package ru.vsu.cs.sis.task1;

import ru.vsu.cs.sis.task1.advertisement.Advertisement;
import ru.vsu.cs.sis.task1.advertisement.AdvertisementImp;
import ru.vsu.cs.sis.task1.bid.Bid;
import ru.vsu.cs.sis.task1.genre.Genre;
import ru.vsu.cs.sis.task1.video.AdvertisementVideo;
import ru.vsu.cs.sis.task1.video.MusicalVideo;
import ru.vsu.cs.sis.task1.video.Video;

public class Main {
    public static void makeSplitter() {
        System.out.println("===============================================");
    }
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

        MusicalVideo musicalVideo = new MusicalVideo("Польская корова", "Polish memes", 123,
                "https://youtube.com", new Genre("Music", 38), "rammstein");
        musicalVideo.play();
        makeSplitter();
        musicalVideo.dislike();

        AdvertisementVideo ad = new AdvertisementVideo("Стоматология онлайн реклама", "Voronezh36",
                15, "https://ktoprochitaltotmolodec228.com", new Genre("Advertisement", 0), "Bobr kurva");
        ad.play();
        makeSplitter();

        Advertisement firstAd = new Advertisement("VK", "This is our ad. Would you like it?",
                "vk.com", 45, 499);
        AdvertisementImp.orderAd(firstAd);
        makeSplitter();

        Advertisement second = new Advertisement("adad", "adasd", "vk.com", 45, 499);
        AdvertisementImp.orderAd(second);
        makeSplitter();
    }
}