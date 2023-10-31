package com.example.examen.Aplication;

import com.example.examen.Domain.IntentoToken;
import com.example.examen.Domain.SistemPayment;
import com.example.examen.Infraestructure.EntityRepository;
import com.example.examen.Infraestructure.SistemPaymentInputPort;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemPaymentUseCase implements SistemPaymentInputPort {

    @Autowired
    EntityRepository entityRepository;

    @Override
    public SistemPayment createSistemPayment(String cardNumber, String cvv, String ExpirationDate, IntentoToken intento) {
        SistemPayment payment = new SistemPayment();
        payment.setCardNumber(cardNumber);
        payment.setCvv(cvv);
        payment.setExpirationDate(ExpirationDate);
        payment.setIntento(intento);
        return entityRepository.save(payment);
    }

    @Override
    public SistemPayment getOne(int paymentId) {
        return entityRepository.getOne(paymentId, SistemPayment.class);
    }

    @Override
    public List<SistemPayment> getAll() {
        return entityRepository.getAll(SistemPayment.class);
    }

}
