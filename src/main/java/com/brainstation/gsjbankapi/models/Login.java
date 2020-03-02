package com.brainstation.gsjbankapi.models;

public class Login {

    private String jwt;
    private int id;
    private boolean autenticated;
    private String  name;
    private String lastname;

    public Login(){

    }

    public Login(String jwt, int id, String name,boolean autenticated,String lastname) {
        this.jwt = jwt;
        this.id = id;
        this.autenticated = autenticated;
        this.name = name;
        this.lastname = lastname;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAutenticated() {
        return autenticated;
    }

    public void setAutenticated(boolean autenticated) {
        this.autenticated = autenticated;
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
}
