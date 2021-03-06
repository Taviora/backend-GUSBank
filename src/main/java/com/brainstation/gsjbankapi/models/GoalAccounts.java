package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.GoalAccountDTO;

import java.time.LocalDate;

public class GoalAccounts {

    private int id;
    private String goalName;
    private float savingFee;
    private String currency;
    private LocalDate initialData;
    private LocalDate finalDate;
    private LocalDate discountDate;
    private float balance;

    public GoalAccounts(){

    }

    public GoalAccounts(GoalAccountDTO goalAccountDTO) {
        this.id = goalAccountDTO.getId();
        this.goalName = goalAccountDTO.getGoalName();
        this.savingFee = goalAccountDTO.getSavingFee();
        this.currency = goalAccountDTO.getCurrency();
        this.initialData = goalAccountDTO.getInitialDate();
        this.finalDate = goalAccountDTO.getFinalDate();
        this.discountDate = goalAccountDTO.getDiscountDate();
        this.balance = goalAccountDTO.getBalance();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public float getSavingFee() {
        return savingFee;
    }

    public void setSavingFee(float savingFee) {
        this.savingFee = savingFee;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getInitialData() {
        return initialData;
    }

    public void setInitialData(LocalDate initialData) {
        this.initialData = initialData;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public LocalDate getDiscountDate() {
        return discountDate;
    }

    public void setDiscountDate(LocalDate discountDate) {
        this.discountDate = discountDate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
