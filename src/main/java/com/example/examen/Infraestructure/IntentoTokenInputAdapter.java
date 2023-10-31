package com.example.examen.Infraestructure;

import com.example.examen.Domain.IntentoToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "Intento")
public class IntentoTokenInputAdapter {

    @Autowired
    IntentoTokenInputPort intentoTokenInputPort;

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public IntentoToken create(@RequestParam String localToken, String productCode, Double total) {
        return intentoTokenInputPort.createIntentoToken(localToken, productCode, total);
    }

    @PostMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public IntentoToken getOne(@RequestParam int intentoTokenId) {
        return intentoTokenInputPort.getOne(intentoTokenId);
    }

    @PostMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<IntentoToken> getAll() {
        List<IntentoToken> dataPlans = intentoTokenInputPort.getAll();
        return dataPlans;
    }
}
