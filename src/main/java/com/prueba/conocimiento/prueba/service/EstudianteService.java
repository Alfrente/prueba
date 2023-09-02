package com.prueba.conocimiento.prueba.service;

import com.prueba.conocimiento.prueba.mapper.request.IEstudianRequestMapper;
import com.prueba.conocimiento.prueba.mapper.response.IEstudianResponseMapper;
import com.prueba.conocimiento.prueba.persistence.entity.Estudiante;
import com.prueba.conocimiento.prueba.persistence.repository.IEstudianteRepository;
import com.prueba.conocimiento.prueba.service.dto.request.EstudianteRequestDto;
import com.prueba.conocimiento.prueba.service.dto.response.EstudianteResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final IEstudianteRepository repository;
    private final IEstudianResponseMapper responseMapper;
    private final IEstudianRequestMapper requestMapper;

    public EstudianteService(IEstudianteRepository repository, IEstudianResponseMapper responseMapper, IEstudianRequestMapper requestMapper) {
        this.repository = repository;
        this.responseMapper = responseMapper;
        this.requestMapper = requestMapper;
    }

    public EstudianteResponseDto getById(Long id) {
        return responseMapper.toEstudianteResponseDto(repository.findById(id).orElse(null));
    }


    public List<EstudianteResponseDto> getAll() {
        return responseMapper.toEstudianteResponseListDto(repository.findAll());
    }

    public EstudianteResponseDto save(EstudianteRequestDto estudiante) {
        return responseMapper.toEstudianteResponseDto(repository.save(requestMapper.toEstudiante(estudiante)));
    }

    public EstudianteResponseDto update(Long id, EstudianteRequestDto estudiante) {
        repository.findById(id).ifPresent(estudiante1 -> repository.save(requestMapper.toEstudiante(estudiante)));
        return responseMapper.toEstudianteResponseDto(repository.findById(id).orElse(null));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
