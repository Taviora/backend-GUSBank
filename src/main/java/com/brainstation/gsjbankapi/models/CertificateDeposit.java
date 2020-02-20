package com.brainstation.gsjbankapi.models;

import java.time.LocalDate;

public class CertificateDeposit {

    private int id;
    private String currency;
    private float mainBalance;
    private float interestMaturity;
    private LocalDate maturityDate;
    private String certificateType;

    public CertificateDeposit(){

    }

    public CertificateDeposit(int id, String currency, float mainBalance, float interestMaturity, LocalDate maturityDate, String certificateType) {
        this.id = id;
        this.currency = currency;
        this.mainBalance = mainBalance;
        this.interestMaturity = interestMaturity;
        this.maturityDate = maturityDate;
        this.certificateType = certificateType;
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

    public float getMainBalance() {
        return mainBalance;
    }

    public void setMainBalance(float mainBalance) {
        this.mainBalance = mainBalance;
    }

    public float getInterestMaturity() {
        return interestMaturity;
    }

    public void setInterestMaturity(float interestMaturity) {
        this.interestMaturity = interestMaturity;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }
}
