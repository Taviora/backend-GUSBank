package com.brainstation.gsjbankapi.models;

import com.brainstation.gsjbankapi.dto.UserDTO;

import java.time.LocalDate;

public class User {

    private int id;
    private String name;
    private String lastname;
    private String idCard;
    private String address;
    private String phoneNumber;
    private String email;
    private LocalDate birthDate;
    private String password;

    public User(){

    };

    public User(UserDTO userDTO){
        this.id = userDTO.getId();
        this.name = userDTO.getName();
        this.lastname = userDTO.getLastname();
        this.idCard = userDTO.getIdCard();
        this.email = userDTO.getEmail();
        this.address = userDTO.getAddress();
        this.birthDate = userDTO.getBirthDate();
        this.password = userDTO.getPassword();
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
