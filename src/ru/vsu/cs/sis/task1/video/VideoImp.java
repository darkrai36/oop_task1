package ru.vsu.cs.sis.task1.video;

import java.util.List;
import java.util.Scanner;

public interface VideoImp {
    void play();

    default void pause() {
        System.out.println("You get a pause. Please, tap on 'Play' again to continue watch video!");
    };
    default void like() {
        System.out.println("Thanks for watching our video! I am so happy cause u like it!");
    };
    default void dislike() {
        System.out.println("Oh, we are so sorry! What could we do to change this situation?");
    };
    default void addComment(List<String> comments) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кто пишет комментарий? - ");
        String author = scanner.nextLine();
        System.out.println("Write comment here -> ");
        String message = scanner.nextLine();
        comments.add(message);
    };
}