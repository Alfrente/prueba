package com.prueba.conocimiento.prueba.persistence.repository;


import com.prueba.conocimiento.prueba.persistence.entity.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradoRepository extends JpaRepository<Grado, Long> {
}
