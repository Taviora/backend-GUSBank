package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.BudgetDTO;

import java.time.LocalDate;

public class Budget {

    private int id;
    private float balance;
    private String description;
    private LocalDate date;

    public Budget(){

    }

    public Budget(BudgetDTO budgetDTO) {
        this.id = budgetDTO.getId();
        this.balance = budgetDTO.getBalance();
        this.description = budgetDTO.getDescription();
        this.date = budgetDTO.getDate();
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
