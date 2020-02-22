package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.AccountMovementDTO;

import java.time.LocalDate;

public class AccountMovement {

    private int id;
    private String originAccount;
    private String finalAccount;
    private float balance;
    private LocalDate date;
    private String detail;
    private int accountId;

    public AccountMovement(){

    }

    public AccountMovement(AccountMovementDTO accountMovementDTO) {
        this.id = accountMovementDTO.getId();
        this.originAccount = accountMovementDTO.getOriginAccount();
        this.finalAccount = accountMovementDTO.getFinalAccount();
        this.balance = accountMovementDTO.getBalance();
        this.date = accountMovementDTO.getDate();
        this.detail = accountMovementDTO.getDetail();
        this.accountId = accountMovementDTO.getAccountId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(String originAccount) {
        this.originAccount = originAccount;
    }

    public String getFinalAccount() {
        return finalAccount;
    }

    public void setFinalAccount(String finalAccount) {
        this.finalAccount = finalAccount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
