package com.prueba.conocimiento.prueba.mapper.response;

import com.prueba.conocimiento.prueba.persistence.entity.Docente;
import com.prueba.conocimiento.prueba.service.dto.response.DocenteResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDocenteResponseMapper {

    @Mapping(target = "telefonoFijo", source = "fijo")
    @Mapping(target = "idTipoDocumento", source = "tipoDocumento.id")
    @Mapping(target = "idGradoResponsable", source = "grado.id")
    @Mapping(target = "asignaturaDictadas", ignore = true)
    DocenteResponseDto toDocenteResponseDto(Docente docente);

    List<DocenteResponseDto> toDocenteResponseListDto(List<Docente> docente);
}
