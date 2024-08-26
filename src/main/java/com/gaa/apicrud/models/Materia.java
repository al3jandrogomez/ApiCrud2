package com.gaa.apicrud.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreMateria;
    @ManyToOne
    @JoinColumn(name="alumno_id")
    @JsonBackReference
    private Alumno alumno;
    @OneToOne
    @JoinColumn(name="profesor_id")
    private Profesor profesor;



}
