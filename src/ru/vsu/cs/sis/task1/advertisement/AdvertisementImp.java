package ru.vsu.cs.sis.task1.advertisement;

public interface AdvertisementImp {
    //TODO Подумать над какими-то еще методами для рекламы
    void showAd();
    void orderAd();
    default void skipAd() {
        System.out.println("Ad was missed. ");
    }
}
