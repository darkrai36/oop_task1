package ru.vsu.cs.sis.task1.bid;

public class Bid {
    //TODO Полностью переделать класс Bid, раз уж это все-таки какая-то заявка или ставка. В качестве текущей альтернативы можно действительно сделать
    private String customerName;
    private static final int minPriceForMessage = 5000;
    private int priceFromCustomer;
    private String message;
    private boolean isImportant;

    public Bid(String customerName, int priceFromCustomer, String message) {
        this.customerName = customerName;
        this.priceFromCustomer = priceFromCustomer;
        this.message = message;
        if (priceFromCustomer > minPriceForMessage) {
            this.isImportant = true;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getPriceFromCustomer() {
        return priceFromCustomer;
    }

    public String getMessage() {
        return message;
    }

    public boolean isImportant() {
        return isImportant;
    }
    public void printMessage() {
        if (isImportant) {
            System.out.println("Срочное объявление (заявка) от " + customerName + "! " + message);
        } else {
            System.out.println("Hello, dear user! We get a new bid from '" + customerName + "'. The message: '" + message + "'.");
        }
    }
}