package com.coderhouse.Clase8.repository;

import com.coderhouse.Clase8.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {


    //Custom Query by method name
    List<Client> findByNameLike(String name);

    //Custom Query by custom JPQL query
    //Atentos con Client, asi se llama la entidad en nuestor programa
    @Query("SELECT a FROM Client a WHERE name = :nombre ORDER BY lastname ASC")
    List<Client> getByNameOrderedByLastnameJPQL(@Param("nombre") String name);

    //Si no se especifica el parámetro nativeQuery, por default se utiliza JPQL
    //Como estamos haciendo nativeQuery, debemos llamar al anombre de la tabla tal cual está en la db
    @Query(value = "SELECT * FROM client a WHERE name = ?1 ORDER BY lastname ASC", nativeQuery = true)
    List<Client> getByNameOrderedByLastnameNativeQuery(String name);
}
