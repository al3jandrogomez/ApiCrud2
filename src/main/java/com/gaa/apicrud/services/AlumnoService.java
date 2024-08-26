package com.gaa.apicrud.services;

import com.gaa.apicrud.models.Alumno;

import java.util.List;

public interface AlumnoService {

    Alumno saveAlumno(Alumno alumno);
    List<Alumno> getAllAlumnos();
    Alumno getAlumnoById(Long id);
    void deleteAlumno(Long id);

}
