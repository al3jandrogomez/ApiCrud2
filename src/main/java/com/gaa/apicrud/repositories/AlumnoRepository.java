package com.gaa.apicrud.repositories;

import com.gaa.apicrud.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
