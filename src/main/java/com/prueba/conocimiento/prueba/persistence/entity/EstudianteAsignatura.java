package com.prueba.conocimiento.prueba.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "estudiante_asignatura")
public class EstudianteAsignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_estudiante")
    private Long idEstudiante;
    @Column(name = "id_asignatura")
    private Long idAsignatura;
    private Double nota;
    private Integer periodo;

    @ManyToOne
    @JoinColumn(name = "id_estudiante", insertable = false, updatable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_asignatura", insertable = false, updatable = false)
    private Asignatura asignatura;
}
