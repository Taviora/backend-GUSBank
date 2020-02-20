package com.brainstation.gsjbankapi.dto;

import com.brainstation.gsjbankapi.models.Budget;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="budget")
public class BudgetDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float balance;
    private String description;
    private LocalDate date;

    public  BudgetDTO(){

    }

    public BudgetDTO(Budget budget) {
        this.id = budget.getId();
        this.balance = budget.getBalance();
        this.description = budget.getDescription();
        this.date = budget.getDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
