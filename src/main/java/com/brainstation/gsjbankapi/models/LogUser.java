package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.LogUserDTO;

import java.time.LocalDate;

public class LogUser {

    private int id;
    private LocalDate lastSessionDate;

    public LogUser(){

    }

    public  LogUser(LogUserDTO logUserDTO){
        this.id = logUserDTO.getId();
        this.lastSessionDate = logUserDTO.getLastSessionDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getLastSessionDate() {
        return lastSessionDate;
    }

    public void setLastSessionDate(LocalDate lastSessionDate) {
        this.lastSessionDate = lastSessionDate;
    }
}
