package com.prueba.conocimiento.prueba.persistence.repository;

import com.prueba.conocimiento.prueba.persistence.entity.TipoDane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDaneRepository extends JpaRepository<TipoDane, Long> {
}
