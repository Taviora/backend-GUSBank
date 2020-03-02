package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.FavoriteAccountDTO;

public class FavoriteAccount {

    private int id;
    private String ownerName;
    private String accountNumber;
    private String bankName;
    private String currency;
    private int userId;

    public FavoriteAccount(){

    }

    public FavoriteAccount(FavoriteAccountDTO favoriteAccountDTO) {
      this.id = favoriteAccountDTO.getId();
      this.ownerName = favoriteAccountDTO.getOwnerName();
      this.accountNumber = favoriteAccountDTO.getAccountNumber();
      this.bankName = favoriteAccountDTO.getBankName();
      this.userId = favoriteAccountDTO.getUserId();
      this.currency = favoriteAccountDTO.getCurrency();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
