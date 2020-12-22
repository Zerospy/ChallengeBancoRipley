package cl.bancoripley.challenge.services;


import cl.bancoripley.challenge.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonaServiceImp{



        private List<Persona> PersonasList = new ArrayList<>(Arrays.asList(

                new Persona("17619755-2", "Aníbal Antonio", "Cáceres Guajardo", "13/01/1993"),
                new Persona("18652938-3", "Fullstack", "Developer Junior", "13/01/1995"),
                new Persona("1234", "Bonus Track", "Sangre, sudor y lagrimas", "01/11/11") )

        );


    public List<Persona> getAllPersonasList(){


        return PersonasList;
    }

    public Persona getPersona(String rut){
        return PersonasList.stream().filter(persona -> persona.getRut().equals(rut)).findFirst().get();
    }


}
