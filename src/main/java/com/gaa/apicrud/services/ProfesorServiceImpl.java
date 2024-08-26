package com.gaa.apicrud.services;

import com.gaa.apicrud.models.Profesor;
import com.gaa.apicrud.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProfesorServiceImpl implements ProfesorService {

   @Autowired
   private ProfesorRepository profesorRepository;

   @Override
    public Profesor getProfesorById(Long id) {
        return profesorRepository.getReferenceById(id);
    }
    @Override
    public List<Profesor> getAllProfesores() {
        return profesorRepository.findAll();
    }
    @Override
    public Profesor saveProfesor(Profesor profesor) {

        return profesorRepository.save(profesor);
    }
    public void deleteProfesor(Long id) {
        profesorRepository.deleteById(id);
    }
}
