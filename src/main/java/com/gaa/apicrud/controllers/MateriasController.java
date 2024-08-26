package com.gaa.apicrud.controllers;

import com.gaa.apicrud.models.Materia;
import com.gaa.apicrud.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriasController {
    @Autowired
    private MateriaService materiaService;



    @GetMapping
    public List<Materia> listarMaterias() {
        return materiaService.getAllMaterias();
    }
    @GetMapping("/{id}")
    public Materia buscarMateria(@PathVariable Long id) {
        return materiaService.getMateriaById(id);
    }
    @DeleteMapping("/{id}")
    public void eliminarMateria(@PathVariable Long id) {
        materiaService.deleteMateria(id);
    }
    @PutMapping
    public ResponseEntity<Materia> editarMateria( @RequestBody Materia materia) {
        if(materiaService.getMateriaById(materia.getId()) == null) {
            return ResponseEntity.notFound().build();
        }

        Materia materialActual = materiaService.saveMateria(materia);
        return ResponseEntity.ok().body(materialActual);

    }
}
