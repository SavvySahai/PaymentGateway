package com.example.paygatee.options;

public class Options {
    private int cardNumber;
    private String name;
    private int cvv;

    public Options(){

    }
//This is for post request
    public Options(int cardNumber, String name, int cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
