package com.brainstation.gsjbankapi.dto;

import com.brainstation.gsjbankapi.models.PayService;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="services")
public class PayServiceDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float cancelBalance;
    private LocalDate date;
    private String description;

    public PayServiceDTO(){
    }

    public PayServiceDTO(PayService payService){
        this.id = payService.getId();
        this.cancelBalance = payService.getCancelBalance();
        this.date = payService.getDate();
        this.description = payService.getDescription();
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
