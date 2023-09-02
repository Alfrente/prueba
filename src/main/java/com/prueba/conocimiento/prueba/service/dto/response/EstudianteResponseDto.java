package com.prueba.conocimiento.prueba.service.dto.response;



import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstudianteResponseDto {
    private Long numeroDocumento;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String email;
    private String fijo;
    private String celular;
    private String idGrado;
    private String idTipoDocumento;
    private String idDane;

}
