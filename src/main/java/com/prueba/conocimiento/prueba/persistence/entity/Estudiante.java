package com.prueba.conocimiento.prueba.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long numerodocumento;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellidos;
    @Column(nullable = false)
    private String fechaNacimiento;
    private String direccion;
    @Column(nullable = false)
    private String email;
    private String fijo;
    @Column(nullable = false)
    private String celular;

    @Column(nullable = false)
    private Long idGrado;
    @Column(name = "id_tipodocumento", nullable = false)
    private Long idTipoDocumento;
    @Column(nullable = false)
    private Long idDane;

    @ManyToOne
    @JoinColumn(name = "id_tipodocumento", insertable = false, updatable = false)
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "idGrado", insertable = false, updatable = false)
    private Grado grado;

    @ManyToOne
    @JoinColumn(name = "idDane", insertable = false, updatable = false)
    private Dane dane;

    @ManyToMany
    @JoinTable(name = "EstudianteAsignatura", joinColumns = @JoinColumn(name = "id_estudiante"),
            inverseJoinColumns = @JoinColumn(name = "id_asignatura")
    )
    private List<Asignatura> asignaturas;

    @OneToMany
    @JoinColumn(name = "id_estudiante", insertable = false, updatable = false)
    private List<EstudianteAsignatura> estudianteAsignaturas;
}
