package com.prueba.conocimiento.prueba.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "dane")
public class Dane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    @Column(name = "id_tipodane")
    private Long idTipoDane;

    @ManyToOne
    @JoinColumn(name = "id_tipodane", updatable = false, insertable = false)
    private TipoDane tipoDane;
}
