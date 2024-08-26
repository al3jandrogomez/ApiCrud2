package com.gaa.apicrud.controllers;

import com.gaa.apicrud.models.Profesor;
import com.gaa.apicrud.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesoresController {
   @Autowired
  private ProfesorService profesorService;


   @GetMapping
    public List<Profesor> listarProfesores() {
    return profesorService.getAllProfesores();
   }
   @GetMapping("/{id}")
    public Profesor buscarProfesor(@PathVariable Long  id) {
       return profesorService.getProfesorById(id);
   }
   @DeleteMapping("/{id}")
    public void eliminarProfesor(@PathVariable Long id){
       profesorService.deleteProfesor(id);
   }

   @PutMapping
    public ResponseEntity<Profesor>actualizarProfesor(@RequestBody Profesor profesor){
       Profesor pr = profesorService.saveProfesor(profesor);
       return ResponseEntity.ok().body(pr);
   }
}
