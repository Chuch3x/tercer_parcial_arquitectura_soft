package com.example.examen.Infraestructure;

import java.util.List;

public interface EntityRepository {

    public <T> T save(T reg);

    public <T> T getOne(int id, Class<T> cl);

    public <T> List<T> getAll(Class<T> cl);
}
