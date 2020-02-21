package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.PayServiceDTO;

import java.time.LocalDate;

public class PayService {

    private int id;
    private float cancelBalance;
    private LocalDate date;
    private String description;

    public PayService(){

    }

    public PayService(PayServiceDTO payServiceDTO) {
        this.id = payServiceDTO.getId();
        this.cancelBalance = payServiceDTO.getCancelBalance();
        this.date = payServiceDTO.getDate();
        this.description = payServiceDTO.getDescription();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCancelBalance() {
        return cancelBalance;
    }

    public void setCancelBalance(float cancelBalance) {
        this.cancelBalance = cancelBalance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
