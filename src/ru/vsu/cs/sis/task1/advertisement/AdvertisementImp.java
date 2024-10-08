package ru.vsu.cs.sis.task1.advertisement;

public interface AdvertisementImp {
    //TODO Подумать над какими-то еще методами для рекламы
    void showAd();
    static void orderAd(Advertisement ad){
        if (ad.getPriceFromCustomer() > Advertisement.getMinPriceForOrder()) {
            ad.showAd();
            System.out.println("Current min price is " + Advertisement.getMinPriceForOrder());
            System.out.println("Your price is " + ad.getPriceFromCustomer());
        } else {
            System.out.println("Pay more money! Current min price is " + Advertisement.getMinPriceForOrder());
            System.out.println("Your price is " + ad.getPriceFromCustomer());
        }
    };

}
