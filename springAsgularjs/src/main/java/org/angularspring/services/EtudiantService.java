package org.angularspring.services;

import org.angularspring.model.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EtudiantService extends JpaRepository<Etudiant,Long>{

    public Etudiant findByNom(String nom);

    @Query(value = "SELECT c FROM Etudiant c WHERE c.nom =:klk")
    public Etudiant findbyklk(@Param("klk")String klk );
}
