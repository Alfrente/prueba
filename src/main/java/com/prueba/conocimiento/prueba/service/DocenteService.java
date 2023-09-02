package com.prueba.conocimiento.prueba.service;

import com.prueba.conocimiento.prueba.mapper.request.IDocenteRequestMapper;
import com.prueba.conocimiento.prueba.mapper.response.IDocenteResponseMapper;
import com.prueba.conocimiento.prueba.persistence.repository.IDocenteRepository;
import com.prueba.conocimiento.prueba.service.dto.request.DocenteRequestDto;
import com.prueba.conocimiento.prueba.service.dto.response.DocenteResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    private final IDocenteRepository repository;
    private final IDocenteResponseMapper docenteResponseMapper;
    private final IDocenteRequestMapper docenteRequestMapper;

    public DocenteService(IDocenteRepository repository, IDocenteResponseMapper docenteResponseMapper, IDocenteRequestMapper docenteRequestMapper) {
        this.repository = repository;
        this.docenteResponseMapper = docenteResponseMapper;
        this.docenteRequestMapper = docenteRequestMapper;
    }

    public DocenteResponseDto getById(Long id) {
        return docenteResponseMapper.toDocenteResponseDto(repository.findById(id).orElse(null));
    }

    public List<DocenteResponseDto> getAll() {
        return docenteResponseMapper.toDocenteResponseListDto(repository.findAll());
    }

    public DocenteResponseDto save(DocenteRequestDto docente) {
        return docenteResponseMapper.toDocenteResponseDto(repository.save(docenteRequestMapper.toDocente(docente)));
    }

    public DocenteResponseDto update(Long id, DocenteRequestDto docente) {
       repository.findById(id).ifPresent(docente1 -> repository.save(docenteRequestMapper.toDocente(docente)));
        //ExceptionGtc("El docente con id " + id + " no esta disponible")
        return docenteResponseMapper.toDocenteResponseDto(repository.findById(id).orElse(null));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
