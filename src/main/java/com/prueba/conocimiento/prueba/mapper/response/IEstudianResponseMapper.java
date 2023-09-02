package com.prueba.conocimiento.prueba.mapper.response;

import com.prueba.conocimiento.prueba.persistence.entity.Estudiante;
import com.prueba.conocimiento.prueba.service.dto.response.EstudianteResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEstudianResponseMapper {

    @Mapping(target = "numeroDocumento", source = "numerodocumento")
    @Mapping(target = "nombres", source = "nombre")
    @Mapping(target = "idTipoDocumento", source = "tipoDocumento.id")
    @Mapping(target = "idGrado", source = "grado.id")
    @Mapping(target = "idDane", source = "dane.id")
    EstudianteResponseDto toEstudianteResponseDto(Estudiante estudiante);

    List<EstudianteResponseDto> toEstudianteResponseListDto(List<Estudiante> estudiantes);
}
