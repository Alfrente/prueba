package com.prueba.conocimiento.prueba.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
   // private Long idDocente;

    @ManyToOne
    @JoinColumn(name = "id_docente", updatable = false, insertable = false)
    private Docente docente;

    @ManyToMany(mappedBy = "asignaturas")
    private List<Estudiante> estudiantes;
}
