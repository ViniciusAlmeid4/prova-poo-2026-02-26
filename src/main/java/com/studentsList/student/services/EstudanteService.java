package com.studentsList.student.services;

import com.studentsList.student.models.Estudante;
import com.studentsList.student.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {
//    @Autowired
//    private EstudanteRepository estudanteRepository;

    private final EstudanteRepository estudanteRepository;

    private EstudanteService(EstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    public List<Estudante> getAll() {
        return estudanteRepository.findAll();
    }

    public Optional<Estudante> getById(Long id) {
        return estudanteRepository.findById(id);
    }

    public Estudante insert(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public void delete(Long id) {
        estudanteRepository.deleteById(id);
        return;
    }

    public Estudante editar(Long id, Estudante estudante) {
        Optional<Estudante> estudanteDb = estudanteRepository.findById(id);

        if (!estudanteDb.isEmpty()) {
            estudante.setId(estudanteDb.get().getId());
        }

        return estudanteRepository.save(estudante);
    }
}
