package co.edu.uco.uconotas.repository;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
    PersonaEntity findByNroDocumentoContaining(String nroDocumento);
}
