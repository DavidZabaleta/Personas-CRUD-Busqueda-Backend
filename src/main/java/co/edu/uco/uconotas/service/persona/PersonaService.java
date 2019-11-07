package co.edu.uco.uconotas.service.persona;

import co.edu.uco.uconotas.model.Persona;

import java.util.List;

public interface PersonaService {

    Persona findById(Long id);

    Persona findByNroDocumentoContaining(String nroDocumento);

    List<Persona> findAll();

    void deleteById(Long id);

    void save(Persona persona);

    void update(Persona persona);

}
