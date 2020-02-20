package com.brainstation.gsjbankapi.models;

import java.time.LocalDate;

public class CreditCardMovement {

    private int id;
    private float balance;
    private String description;
    private LocalDate date;

    public CreditCardMovement(){

    }

    public CreditCardMovement(int id, float balance, String description, LocalDate date) {
        this.id = id;
        this.balance = balance;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
