package com.gaa.apicrud.services;

import com.gaa.apicrud.models.Alumno;
import com.gaa.apicrud.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno saveAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
        return alumno;
    }

    @Override
    public Alumno getAlumnoById(Long id) {
        return alumnoRepository.getReferenceById(id);
    }

    @Override
    public List<Alumno> getAllAlumnos() {

        return alumnoRepository.findAll();
    }

    @Override
    public void deleteAlumno(Long id){
       alumnoRepository.deleteById(id);

    }
}
