package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.AccountDTO;

import java.time.LocalDate;

public class Account {

    private int id;
    private String currency;
    private String description;
    private String ibanNumber;
    private String bankNumber;
    private LocalDate createdDate;
    private float minimumBalance;
    private float balance;
    private float interest;
    private int userId;

    public Account() {

    }

    public Account(AccountDTO accountDTO) {

        this.id = accountDTO.getId();
        this.currency = accountDTO.getCurrency();
        this.description = accountDTO.getDescription();
        this.bankNumber = accountDTO.getBankNumber();
        this.ibanNumber = accountDTO.getIbanNumber();
        this.createdDate = accountDTO.getCreatedDate();
        this.minimumBalance = accountDTO.getMinimumBalance();
        this.interest = accountDTO.getInterest();
        this.userId = accountDTO.getUserId();
        this.balance = accountDTO.getBalance();
    }



    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIbanNumber() {
        return ibanNumber;
    }

    public void setIbanNumber(String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(float minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
