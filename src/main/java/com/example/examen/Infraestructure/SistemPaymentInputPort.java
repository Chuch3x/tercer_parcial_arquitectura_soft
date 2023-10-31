package com.example.examen.Infraestructure;

import com.example.examen.Domain.IntentoToken;
import com.example.examen.Domain.SistemPayment;
import java.util.List;

public interface SistemPaymentInputPort {
    public SistemPayment createSistemPayment(String cardNumber, String cvv, String ExpirationDate, IntentoToken intento);

    public SistemPayment getOne(int paymentId);

    public List<SistemPayment> getAll();
}
