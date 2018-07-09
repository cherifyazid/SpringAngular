package org.angularspring.controllers;

import org.angularspring.model.Etudiant;
import org.angularspring.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping(value = "/api/etudiantcontroller")
@CrossOrigin(origins = "http://localhost:4200")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @PostConstruct
    public void init(){
        Etudiant e = new Etudiant();
    }


    @GetMapping("/")
    @ResponseBody
    public List<Etudiant> get() {
        return etudiantService.findAll();
    }
}
