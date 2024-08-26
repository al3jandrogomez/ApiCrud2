package com.gaa.apicrud.controllers;

import com.gaa.apicrud.models.Alumno;
import com.gaa.apicrud.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping
    public Alumno registrarAlumno(@RequestBody Alumno alumno) {
         return alumnoService.saveAlumno(alumno);
    }
    @GetMapping
    public List<Alumno> listarAlumnos() {
        return alumnoService.getAllAlumnos();
    }
    @GetMapping("/{id}")
    public Alumno obtenerAlumno(@PathVariable Long id) {
        return alumnoService.getAlumnoById(id);
    }
    @DeleteMapping("/{id}")
    public void eliminarAlumno(@PathVariable Long id) {
        alumnoService.deleteAlumno(id);
    }
    @PutMapping
    public ResponseEntity<Alumno> actualizarAlumno(@RequestBody Alumno alumno) {
        Alumno alumnoActual = alumnoService.saveAlumno(alumno);
        return ResponseEntity.ok().body(alumnoActual);
    }


}
