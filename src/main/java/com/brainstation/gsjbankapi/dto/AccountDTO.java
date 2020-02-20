package com.brainstation.gsjbankapi.dto;

import com.brainstation.gsjbankapi.models.Account;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="accounts")
public class AccountDTO {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String currency;
    private String description;
    private String ibanNumber;
    private String bankNumber;
    private String phoneNumber;
    private LocalDate createdDate;
    private float minimumBalance;
    private float interest;

    public AccountDTO(){

    }

    public AccountDTO(Account account){
        this.id = account.getId();
        this.currency = account.getCurrency();
        this.description =  account.getDescription();
        this.ibanNumber = account.getIbanNumber();
        this.bankNumber = account.getBankNumber();
        this.phoneNumber = account.getPhoneNumber();
        this.createdDate = account.getCreatedDate();
        this.minimumBalance = account.getMinimumBalance();
        this.interest = account.getInterest();
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
