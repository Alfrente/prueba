package com.prueba.conocimiento.prueba.persistence.repository;


import com.prueba.conocimiento.prueba.persistence.entity.EstudianteAsignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteAsignaturaRepository extends JpaRepository<EstudianteAsignatura, Long> {
}
