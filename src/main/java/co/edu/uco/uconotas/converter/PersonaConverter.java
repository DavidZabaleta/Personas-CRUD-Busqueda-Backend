package co.edu.uco.uconotas.converter;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;
import co.edu.uco.uconotas.model.TipoDocumentoDeIdentidad;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonaConverter {

    public Persona entityToModel (PersonaEntity personaEntity){

        var persona = new Persona();
        persona.setId(personaEntity.getId());
        persona.setNombre(personaEntity.getNombre());
        persona.setApellido(personaEntity.getApellido());
        persona.setIdDocumentoIdentidad(personaEntity.getIdDocumentoIdentidad());
        persona.setNroDocumento(personaEntity.getNroDocumento());
        persona.setTelefono(personaEntity.getTelefono());
        persona.setFechaNacimiento(personaEntity.getFechaNacimiento());
        return persona;
    }

    public PersonaEntity modelToEntity(Persona persona) {
        var personaEntity = new PersonaEntity();
        personaEntity.setId(persona.getId());
        personaEntity.setNombre(persona.getNombre());
        personaEntity.setApellido(persona.getApellido());
        personaEntity.setIdDocumentoIdentidad(persona.getTipoDocumentoIdentidad().getId());
        personaEntity.setNroDocumento(persona.getNroDocumento());
        personaEntity.setTelefono(persona.getTelefono());
        personaEntity.setFechaNacimiento(persona.getFechaNacimiento());
        return personaEntity;
    }

    public PersonaEntity modelToEntityUpdate(Persona persona) {
        var personaEntity = new PersonaEntity();
        personaEntity.setId(persona.getId());
        personaEntity.setNombre(persona.getNombre());
        personaEntity.setApellido(persona.getApellido());
        personaEntity.setIdDocumentoIdentidad(persona.getIdDocumentoIdentidad());
        personaEntity.setNroDocumento(persona.getNroDocumento());
        personaEntity.setTelefono(persona.getTelefono());
        personaEntity.setFechaNacimiento(persona.getFechaNacimiento());
        return personaEntity;
    }

    public List<Persona> entityToModel (List<PersonaEntity> personasEntity){
        List<Persona> personas = new ArrayList<>(personasEntity.size());
        personasEntity.forEach(entity ->{
            personas.add(entityToModel(entity));
        });
        return personas;
    }

    public Persona entityToModel (Optional<PersonaEntity> personaEntity){

        Persona persona = null;

        if (personaEntity.isPresent()){
            persona = new Persona();
            persona.setId(personaEntity.get().getId());
            persona.setNombre(personaEntity.get().getNombre());
            persona.setApellido(personaEntity.get().getApellido());
            persona.setIdDocumentoIdentidad(personaEntity.get().getIdDocumentoIdentidad());
            persona.setNroDocumento(personaEntity.get().getNroDocumento());
            persona.setTelefono(personaEntity.get().getTelefono());
            persona.setFechaNacimiento(personaEntity.get().getFechaNacimiento());
        }
        return persona;
    }
}
