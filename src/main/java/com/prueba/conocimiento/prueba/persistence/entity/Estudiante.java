package com.prueba.conocimiento.prueba.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Estudiante")
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
    /*
    @Column(nullable = false)
    //private Long idGrado;
    @Column(nullable = false)
    private Long idTipoDocumento;
    @Column(nullable = false)
    private Long idDane;
*/
    @ManyToOne
    @JoinColumn(name = "id_tipodocumento", insertable = false, updatable = false)
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "id_grado", insertable = false, updatable = false)
    private Grado grado;

    @ManyToOne
    @JoinColumn(name = "id_dane", insertable = false, updatable = false)
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
