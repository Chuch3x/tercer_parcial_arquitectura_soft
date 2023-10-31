package com.example.examen.Aplication;

import com.example.examen.Domain.IntentoToken;
import com.example.examen.Infraestructure.EntityRepository;
import com.example.examen.Infraestructure.IntentoTokenInputPort;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IntentoTokenUseCase implements IntentoTokenInputPort{
    @Autowired
    EntityRepository entityRepository;
    
    @Override
    public IntentoToken createIntentoToken(String localToken, String productCode, Double total) {
        IntentoToken intentoToken = new IntentoToken();
            intentoToken.setLocalToken(localToken);
            intentoToken.setProductCode(productCode);
            intentoToken.setTotal(total);
        return entityRepository.save(intentoToken);
    }

    @Override
    public IntentoToken getOne(int intentoId) {
        return entityRepository.getOne(intentoId,IntentoToken.class);
    }

    @Override
    public List<IntentoToken> getAll() {
        return entityRepository.getAll(IntentoToken.class);
    }
}