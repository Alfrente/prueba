package com.prueba.conocimiento.prueba.mapper.request;

import com.prueba.conocimiento.prueba.persistence.entity.Docente;
import com.prueba.conocimiento.prueba.service.dto.request.DocenteRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDocenteRequestMapper {


    @Mapping(target = "tipoDocumento", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "grado", ignore = true)
    @Mapping(target = "fijo", source = "telefonoFijo")
    @Mapping(target = "asignaturaList", ignore = true)
    @Mapping(target = "asigDictadas", source = "asignaturaDictadas")
    Docente toDocente(DocenteRequestDto docenteRequestDto);

    List<Docente> toDocenteList(List<DocenteRequestDto> docenteRequestDto);

}
