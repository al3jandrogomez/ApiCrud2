package com.gaa.apicrud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String nombreAlumno;
    @OneToMany(mappedBy = "alumno" , cascade = CascadeType.ALL )
    private List<Materia> materias;

}
