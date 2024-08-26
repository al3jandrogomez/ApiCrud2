package com.gaa.apicrud.services;

import com.gaa.apicrud.models.Materia;

import java.util.List;

public interface MateriaService {

    Materia saveMateria(Materia materia);
    List<Materia> getAllMaterias();
    Materia getMateriaById(Long id);
    void deleteMateria(Long id);
}
