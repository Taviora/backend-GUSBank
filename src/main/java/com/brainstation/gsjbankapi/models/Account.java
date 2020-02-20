package com.brainstation.gsjbankapi.models;

import java.time.LocalDate;

public class Account {

    private int id;
    private String currency;
    private String description;
    private String ibanNumber;
    private String bankNumber;
    private String phoneNumber;
    private LocalDate createdDate;
    private float minimumBalance;
    private float interest;

    public Account() {

    }

    public Account(Account accountDTO) {

        this.id = accountDTO.getId();
        this.currency = accountDTO.getCurrency();
        this.description = accountDTO.getDescription();
        this.ibanNumber = accountDTO.getBankNumber();
        this.phoneNumber = accountDTO.getPhoneNumber();
        this.createdDate = accountDTO.getCreatedDate();
        this.minimumBalance = accountDTO.getMinimumBalance();
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
}
