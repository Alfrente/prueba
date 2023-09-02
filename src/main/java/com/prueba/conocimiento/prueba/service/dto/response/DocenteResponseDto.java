package com.prueba.conocimiento.prueba.service.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocenteResponseDto {
    private Long numeroDocumento;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private List<String> asignaturaDictadas;
    private String gradoEscolaridad;
    private String email;
    private String telefonoFijo;
    private String celular;
    private String idTipoDocumento;
    private String idGradoResponsable;

}
