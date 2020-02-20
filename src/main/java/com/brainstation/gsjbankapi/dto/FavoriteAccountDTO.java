package com.brainstation.gsjbankapi.dto;

import com.brainstation.gsjbankapi.models.FavoriteAccount;

import javax.persistence.*;

@Entity
@Table(name = "favorite_accounts")
public class FavoriteAccountDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ownerName;
    private String accountNumber;
    private String bankName;

    public FavoriteAccountDTO(){
    }

    public FavoriteAccountDTO(FavoriteAccount favoriteAccount){
        this.id = favoriteAccount.getId();
        this.ownerName = favoriteAccount.getOwnerName();
        this.accountNumber = favoriteAccount.getAccountNumber();
        this.bankName = favoriteAccount.getBankName();
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
}
