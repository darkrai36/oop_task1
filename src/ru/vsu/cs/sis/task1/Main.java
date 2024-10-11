package ru.vsu.cs.sis.task1;

import ru.vsu.cs.sis.task1.advertisement.Advertisement;
import ru.vsu.cs.sis.task1.genre.Genre;
import ru.vsu.cs.sis.task1.video.MusicalVideo;
import ru.vsu.cs.sis.task1.video.Video;
import java.util.Scanner;

public class Main {
    //TODO 1) Реализовать классы-наследники для рекламы с целью конкретизации дополнительных областей
    //TODO 2) Обязательно использовать где-то статическую константу. Первое, что пришло в голову - максимальная цена за рекламу.
    //TODO 3) Интерфейсы имеются - отлично. Надо подумать над реализацией equals/hashCode, но пока до этого далеко.
    // В приоритете - 2 пункта выше.
    //TODO 4) Может быть, попробовать поработать со словарями для обработки комментариев?
    /*TODO Задания конкретно на ООП:
       1)+Реализация полиморфизма(Метод переопределить. Можно несколько. Постарайтесь это делать более логично, в рамках предметной области. Работайте мозгами, импровизируйте.)
       2)+Обязательно хочу увидеть статические блоки и нестатические.
       3) +Статический метод(1-2шт). Статические поля(будет плюсом)
       4) +Обязательно поработать со статической константой!
       5) +ПОНИМАНИЕ! Что вы делаете, зачем) Могу спросить что-то по теме!)
    */
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

        Video s = new Video("hui", "pizda", 45, "x.com", new Genre("porn", 100000));
        Video.addVideoToPlaylist(f);
        Video.addVideoToPlaylist(s);
        Video.playlistToString(Video.getPlaylist());
    }
}