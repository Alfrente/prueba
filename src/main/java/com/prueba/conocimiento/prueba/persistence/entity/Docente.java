package com.prueba.conocimiento.prueba.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numeroDocumento;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String asigDictadas;
    private String gradoEscolaridad;
    private String email;
    private String fijo;
    private String celular;
    //private Long idTipoDocumento;
    //private Long idGradoResponsable;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", updatable = false, insertable = false)
    private TipoDocumento tipoDocumento;
    @ManyToOne
    @JoinColumn(name = "id_grado_responsable", updatable = false, insertable = false)
    private Grado grado;
    @OneToMany(mappedBy = "docente")
    private List<Asignatura> asignaturaList;

}
