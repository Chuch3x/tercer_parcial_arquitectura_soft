package com.example.examen.Infraestructure;

import com.example.examen.Domain.IntentoToken;
import com.example.examen.Domain.SistemPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "Payment")
public class SistemPaymentInputAdapter {

    @Autowired
    SistemPaymentInputPort paymentInputPort;

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public SistemPayment create(@RequestParam String cardNumber, String cvv, String ExpirationDate, IntentoToken intento) {
        return paymentInputPort.createSistemPayment(cardNumber, cvv, ExpirationDate, intento);
    }

    @PostMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public SistemPayment getOne(@RequestParam int intentoTokenId) {
        return paymentInputPort.getOne(intentoTokenId);
    }

    @PostMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SistemPayment> getAll() {
        List<SistemPayment> dataPlans = paymentInputPort.getAll();
        return dataPlans;
    }
}
