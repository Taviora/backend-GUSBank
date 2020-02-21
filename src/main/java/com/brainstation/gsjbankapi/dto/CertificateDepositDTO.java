package com.brainstation.gsjbankapi.dto;

import com.brainstation.gsjbankapi.models.CertificateDeposit;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "certificates_deposit")
public class CertificateDepositDTO {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String currency;
    private float mainBalance;
    private float interestMaturity;
    private LocalDate maturityDate;
    private String certificateType;

    public CertificateDepositDTO(){

    }

    public CertificateDepositDTO(CertificateDeposit certificateDeposit){
        this.id = certificateDeposit.getId();
        this.currency = certificateDeposit.getCurrency();
        this.mainBalance = certificateDeposit.getMainBalance();
        this.interestMaturity = certificateDeposit.getInterestMaturity();
        this.maturityDate = certificateDeposit.getMaturityDate();
        this.certificateType = certificateDeposit.getCertificateType();
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
