package com.prueba.conocimiento.prueba.persistence.repository;


import com.prueba.conocimiento.prueba.persistence.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {
}
