package org.angularspring.model;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Cour implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    @ManyToMany
    private List<Etudiant> etudiants;



}
