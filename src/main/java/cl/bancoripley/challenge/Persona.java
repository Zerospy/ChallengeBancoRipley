package cl.bancoripley.challenge;
import cl.bancoripley.challenge.dto.PersonaDTO;

public class Persona {

    private String rut;
    private String nombre;
    private String apellido;
    private String fechaNac;

    public Persona(){

    }

    public Persona(String rut, String nombre, String apellido, String fechaNac) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }


public PersonaDTO toDTO () {

    PersonaDTO personaDTO = new PersonaDTO();
    personaDTO.setRut(this.getRut());
    personaDTO.setNombre(this.getNombre());
    personaDTO.setApellido(this.getApellido());
    personaDTO.setFechaNac(this.getFechaNac());
    return personaDTO;
        }
}
