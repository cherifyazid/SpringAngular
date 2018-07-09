package org.angularspring.controllers;

import org.angularspring.model.Etudiant;
import org.angularspring.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/api/courController")
public class CourController {


    @Autowired
    private EtudiantService etudiantService;

    @PostConstruct
    public void init() {
        Etudiant e = new Etudiant();
        e.setNom("haa");
        e.setPrenom("waaa");
        e.setAge(28);
        etudiantService.save(e);

        Etudiant e2 = new Etudiant();
        e2.setNom("cherif");
        e2.setPrenom("yazid");
        e2.setAge(27);
        etudiantService.save(e2);


        Etudiant e3 = new Etudiant();
        e3.setNom("baaaa");
        e3.setPrenom("saaaaa");
        e3.setAge(26);
        etudiantService.save(e3);

        Etudiant e4 = new Etudiant();
        e4.setNom("rraaa");
        e4.setPrenom("sdda");
        e3.setAge(26);
        etudiantService.save(e3);
    }




    @GetMapping("/find/{nom}")
    @ResponseBody
    public Etudiant find(@PathVariable("nom") String nom) {
        return etudiantService.findByNom(nom);
    }

    @GetMapping("/findkkk/{nom}")
    @ResponseBody
    public Etudiant findkkk(@PathVariable("nom") String nom) {
        return etudiantService.findbyklk(nom);
    }


}
