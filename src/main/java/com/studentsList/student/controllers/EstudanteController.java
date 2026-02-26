package com.studentsList.student.controllers;

import com.studentsList.student.models.Estudante;
import com.studentsList.student.repositories.EstudanteRepository;
import com.studentsList.student.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estudante")
public class EstudanteController {
//    @Autowired
//    private EstudanteService estudanteService;

    private final EstudanteService estudanteService;

    private EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @GetMapping(path = "/{id}")
    public Optional<Estudante> get(@PathVariable Long id) {
        return estudanteService.getById(id);
    }

    @GetMapping()
    public List<Estudante> getAll() {
        return estudanteService.getAll();
    }

    @PostMapping()
    public Estudante create(@RequestBody Estudante estudante) {
        return estudanteService.insert(estudante);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        estudanteService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
