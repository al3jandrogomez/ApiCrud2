package com.gaa.apicrud.repositories;

import com.gaa.apicrud.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
