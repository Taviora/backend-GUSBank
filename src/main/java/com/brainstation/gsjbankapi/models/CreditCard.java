package com.brainstation.gsjbankapi.models;

import java.time.LocalDate;

public class CreditCard {

    private int id;
    private String type;
    private float balance;
    private LocalDate expirationDate;
    private String status;
    private float availableBalance;

    public CreditCard(){

    }

    public CreditCard(int id, String type, float balance, LocalDate expirationDate, String status, float availableBalance) {
        this.id = id;
        this.type = type;
        this.balance = balance;
        this.expirationDate = expirationDate;
        this.status = status;
        this.availableBalance = availableBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(float availableBalance) {
        this.availableBalance = availableBalance;
    }


}
