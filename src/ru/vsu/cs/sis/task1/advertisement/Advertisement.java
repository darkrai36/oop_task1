package ru.vsu.cs.sis.task1.advertisement;

public class Advertisement implements AdvertisementImp{
    private String customer;
    private String description;
    private String link;
    private int duration;
    private int priceFromCustomer;
    private static int counter;
    private static int minPriceForOrder;

    static {
        counter = 1;
        minPriceForOrder = 500;
    }

    public Advertisement(String customer, String description, String link, int duration, int priceFromCustomer) {
        this.customer = customer;
        this.description = description;
        this.link = link;
        this.duration = duration;
        this.priceFromCustomer = priceFromCustomer;
        minPriceForOrder = 500 * counter;
        counter++;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public int getDuration() {
        return duration;
    }

    public int getPriceFromCustomer() {
        return priceFromCustomer;
    }

    public static int getCounter() {
        return counter;
    }

    public static int getMinPriceForOrder() {
        return minPriceForOrder;
    }

    @Override
    public void showAd() {
        counter--;
        System.out.println("Now you will view an ad from " + customer);
        System.out.println("It's shown for " + duration + " seconds.");
        System.out.println("Message from " + customer + ": " + description);
    }
}
