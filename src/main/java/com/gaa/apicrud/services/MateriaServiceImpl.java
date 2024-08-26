package com.gaa.apicrud.services;

import com.gaa.apicrud.models.Materia;
import com.gaa.apicrud.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public Materia saveMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia getMateriaById(Long id) {
        return materiaRepository.getReferenceById(id);
    }
    @Override
    public List<Materia> getAllMaterias() {
        return materiaRepository.findAll();
    }

    @Override
    public void deleteMateria(Long id){
        materiaRepository.deleteById(id);
    }


}
