package com.prueba.conocimiento.prueba.persistence.repository;


import com.prueba.conocimiento.prueba.persistence.entity.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {
}
