package com.prueba.conocimiento.prueba.service.dto.request;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstudianteRequestDto {
    private Long numeroDocumento;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String email;
    private Long telefonoFijo;
    private Long celular;
    private Long idGrado;
    private Long idTipoDocumento;
    private Long idDane;
    private String ciudadResidencia;
    private String direccionResidencia;
    private String nombreCompletoAcudiente;

}
