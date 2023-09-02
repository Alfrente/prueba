package com.prueba.conocimiento.prueba.controller;

import com.prueba.conocimiento.prueba.persistence.entity.Docente;
import com.prueba.conocimiento.prueba.service.DocenteService;
import com.prueba.conocimiento.prueba.service.dto.request.DocenteRequestDto;
import com.prueba.conocimiento.prueba.service.dto.response.DocenteResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docentes")
@RequiredArgsConstructor
public class DocenteController {
    private final DocenteService service;

    @GetMapping
    public ResponseEntity<List<DocenteResponseDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocenteResponseDto> getById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<DocenteResponseDto> save(@RequestBody @Valid DocenteRequestDto docenteRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(docenteRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DocenteResponseDto> update(@PathVariable("id") Long id, @RequestBody DocenteRequestDto docenteRequestDto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.update(id, docenteRequestDto));
    }
}
