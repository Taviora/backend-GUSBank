package com.brainstation.gsjbankapi.dto;

import com.brainstation.gsjbankapi.models.GoalAccounts;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="goal_accounts")
public class GoalAccountDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String goalName;
    private float savingFee;
    private String currency;
    private LocalDate initialDate;
    private LocalDate finalDate;
    private LocalDate discountDate;
    private float balance;

    public GoalAccountDTO(){

    }

    public GoalAccountDTO(GoalAccounts goalAccounts){
        this.id = goalAccounts.getId();
        this.goalName = goalAccounts.getGoalName();
        this.savingFee = goalAccounts.getSavingFee();
        this.currency = goalAccounts.getCurrency();
        this.initialDate = goalAccounts.getInitialData();
        this.finalDate = goalAccounts.getFinalDate();
        this.discountDate = goalAccounts.getFinalDate();
        this.balance = goalAccounts.getBalance();
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

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
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
