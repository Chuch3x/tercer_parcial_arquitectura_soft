package com.example.examen.Domain;

public class SistemPayment {

    private String cardNumber;
    private String cvv;
    private String ExpirationDate;
    private IntentoToken intento;

    public SistemPayment() {
    }

    public SistemPayment(String cardNumber, String cvv, String ExpirationDate, IntentoToken intento) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.ExpirationDate = ExpirationDate;
        this.intento = intento;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public IntentoToken getIntento() {
        return intento;
    }

    public void setIntento(IntentoToken intento) {
        this.intento = intento;
    }

   

}
