package com.prueba.conocimiento.prueba.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numerodocumento")
    private Long numeroDocumento;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String asigDictadas;
    private String gradoEscolaridad;
    private String email;
    private String fijo;
    private String celular;
    @Column(name = "id_tipodocumento")
    private Long idTipoDocumento;
    @Column(name = "id_gradoresponsable")
    private Long idGradoResponsable;

    @ManyToOne
    @JoinColumn(name = "id_tipodocumento", updatable = false, insertable = false)
    private TipoDocumento tipoDocumento;
    @ManyToOne
    @JoinColumn(name = "id_gradoresponsable", updatable = false, insertable = false)
    private Grado grado;
    @OneToMany(mappedBy = "docente")
    private List<Asignatura> asignaturaList;

}
