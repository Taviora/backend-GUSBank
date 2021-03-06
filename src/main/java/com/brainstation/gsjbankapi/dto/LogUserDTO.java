package com.brainstation.gsjbankapi.dto;

import com.brainstation.gsjbankapi.models.LogUser;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "log_user")
public class LogUserDTO  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate lastSessionDate;
    private int userId;

    public LogUserDTO(){

    }

    public LogUserDTO(LogUser logUser){
        this.id = logUser.getId();
        this.lastSessionDate = logUser.getLastSessionDate();
        this.userId = logUser.getUserId();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
