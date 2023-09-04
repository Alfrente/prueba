package com.prueba.conocimiento.prueba.mapper.request;

import com.prueba.conocimiento.prueba.persistence.entity.Estudiante;
import com.prueba.conocimiento.prueba.service.dto.request.EstudianteRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEstudianRequestMapper {


    @Mapping(target = "numerodocumento", source = "numeroDocumento")
    @Mapping(target = "nombre", source = "nombres")
    @Mapping(target = "tipoDocumento", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "grado", ignore = true)
    @Mapping(target = "fijo", source = "telefonoFijo")
    @Mapping(target = "estudianteAsignaturas", ignore = true)
    @Mapping(target = "direccion", source = "direccionResidencia")
    @Mapping(target = "dane", ignore = true)
    @Mapping(target = "asignaturas", ignore = true)
    Estudiante toEstudiante(EstudianteRequestDto estudianteRequestDto);

    List<Estudiante> toEstudianteList(List<EstudianteRequestDto> estudianteRequestDtoList);
}
