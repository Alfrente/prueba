package com.prueba.conocimiento.prueba.service.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocenteRequestDto {
    private Long numeroDocumento;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String asignaturaDictadas;
    private String gradoEscolaridad;
    private String email;
    private Long telefonoFijo;
    private Long celular;
    private Long idTipoDocumento;
    private Long idGradoResponsable;
}
