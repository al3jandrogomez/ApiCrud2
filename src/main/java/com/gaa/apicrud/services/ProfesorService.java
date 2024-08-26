package com.gaa.apicrud.services;

import com.gaa.apicrud.models.Profesor;

import java.util.List;

public interface ProfesorService {
    Profesor saveProfesor(Profesor profesor);
    List<Profesor> getAllProfesores();
    Profesor getProfesorById(Long id);
    void deleteProfesor(Long id);
}
