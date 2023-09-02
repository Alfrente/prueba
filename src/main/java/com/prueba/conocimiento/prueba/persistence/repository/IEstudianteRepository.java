package com.prueba.conocimiento.prueba.persistence.repository;


import com.prueba.conocimiento.prueba.persistence.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

    /*@Query(name = """
            SELECT e.nombres as nombreEstudiante, ea.nota as notaEstudiante,
            g.descripcion as nombreCurso, d.nombres as nombreDocente
            FROM estudiante e join estudiante_asignatura ea on ea.id_asignatura = e.id
            join grado g on e.id=g.id join docente d on g.id=d.id_grado_responsable
            where ea.nota > 3.1 order by ea.nota asc
            """, nativeQuery = true)*/
    //List<SDto> estudiantesJoinNota();
}
