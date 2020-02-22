package com.brainstation.gsjbankapi.dto;

import com.brainstation.gsjbankapi.models.AccountMovement;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "accounts_movements")
public class AccountMovementDTO {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String originAccount;
    private String finalAccount;
    private float balance;
    private LocalDate date;
    private String detail;
    private int accountId;

    public AccountMovementDTO(){

    }

    public AccountMovementDTO(AccountMovement accountMovement) {
        this.id = accountMovement.getId();
        this.originAccount = accountMovement.getOriginAccount();
        this.finalAccount = accountMovement.getFinalAccount();
        this.balance = accountMovement.getBalance();
        this.date = accountMovement.getDate();
        this.detail = accountMovement.getDetail();
        this.accountId = accountMovement.getAccountId();
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
