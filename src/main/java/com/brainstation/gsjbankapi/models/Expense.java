package com.brainstation.gsjbankapi.models;

public class Expense {

    private int id;
    private float money;
    private String description;

    public Expense(){

    }

    public Expense(int id, float money, String description) {
        this.id = id;
        this.money = money;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
