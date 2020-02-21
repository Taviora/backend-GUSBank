package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.CertificateDepositDTO;

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

    public CertificateDeposit(CertificateDepositDTO certificateDepositDTO) {
        this.id = certificateDepositDTO.getId();
        this.currency = certificateDepositDTO.getCurrency();
        this.mainBalance = certificateDepositDTO.getMainBalance();
        this.interestMaturity = certificateDepositDTO.getInterestMaturity();
        this.maturityDate = certificateDepositDTO.getMaturityDate();
        this.certificateType = certificateDepositDTO.getCertificateType();
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
