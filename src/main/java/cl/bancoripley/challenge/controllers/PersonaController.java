package cl.bancoripley.challenge.controllers;


import cl.bancoripley.challenge.Persona;
import cl.bancoripley.challenge.services.PersonaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonaController {



    @Autowired
    public PersonaServiceImp personaServiceImp;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Persona> findAll() {

        return personaServiceImp.getAllPersonasList();
    }


    @RequestMapping("/{rut}")
    @ResponseStatus(HttpStatus.OK)
    public Persona getPersona(@PathVariable("rut") String rut){


        return personaServiceImp.getPersona(rut);
    }




}