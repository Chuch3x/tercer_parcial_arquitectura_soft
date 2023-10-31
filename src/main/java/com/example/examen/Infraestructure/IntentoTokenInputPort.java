package com.example.examen.Infraestructure;

import com.example.examen.Domain.IntentoToken;
import java.util.List;

public interface IntentoTokenInputPort {

    public IntentoToken createIntentoToken(String localToken, String productCode, Double total);

    public IntentoToken getOne(int intentoId);

    public List<IntentoToken> getAll();
}
