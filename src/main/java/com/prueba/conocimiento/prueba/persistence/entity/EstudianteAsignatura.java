package com.prueba.conocimiento.prueba.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "EstudianteAsignatura")
public class EstudianteAsignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private Long idEstudiante;
    //private Long idAsignatura;
    private Double nota;
    private Integer periodo;

    @ManyToOne
    @JoinColumn(name = "id_estudiante", insertable = false, updatable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id-asignatura", insertable = false, updatable = false)
    private Asignatura asignatura;
}
