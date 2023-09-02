package com.prueba.conocimiento.prueba.persistence.repository;


import com.prueba.conocimiento.prueba.persistence.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocenteRepository extends JpaRepository<Docente, Long> {
}
