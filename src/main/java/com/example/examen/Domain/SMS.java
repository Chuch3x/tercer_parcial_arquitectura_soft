package com.example.examen.Domain;

public class SMS {
    private String messge;
    private int phoneNumberDestinatary;

    public SMS() {
    }

    public SMS(String messge, int phoneNumberDestinatary) {
        this.messge = messge;
        this.phoneNumberDestinatary = phoneNumberDestinatary;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }

    public int getPhoneNumberDestinatary() {
        return phoneNumberDestinatary;
    }

    public void setPhoneNumberDestinatary(int phoneNumberDestinatary) {
        this.phoneNumberDestinatary = phoneNumberDestinatary;
    }
    
}
