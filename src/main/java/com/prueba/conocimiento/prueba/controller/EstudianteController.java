package com.prueba.conocimiento.prueba.controller;

import com.prueba.conocimiento.prueba.persistence.entity.Estudiante;
import com.prueba.conocimiento.prueba.service.EstudianteService;
import com.prueba.conocimiento.prueba.service.dto.request.EstudianteRequestDto;
import com.prueba.conocimiento.prueba.service.dto.response.EstudianteResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
@RequiredArgsConstructor
public class EstudianteController {
    private final EstudianteService service;

    @GetMapping
    public ResponseEntity<List<EstudianteResponseDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstudianteResponseDto> getById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<EstudianteResponseDto> save(@RequestBody @Valid EstudianteRequestDto estudiante) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(estudiante));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Estudiante> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstudianteResponseDto> update(@PathVariable("id") Long id, @RequestBody @Valid EstudianteRequestDto estudiante) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.update(id, estudiante));
    }
}
