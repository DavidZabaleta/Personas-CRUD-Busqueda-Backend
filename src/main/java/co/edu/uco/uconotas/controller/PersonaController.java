package co.edu.uco.uconotas.controller;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;
import co.edu.uco.uconotas.service.persona.PersonaService;
import co.edu.uco.uconotas.service.persona.impl.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/personas")
@CrossOrigin(origins = "https://localhost:4200")
public class PersonaController {

    @Autowired
    private PersonaServiceImpl personaService;

    @GetMapping(value = "/persona/{id}")
    public Persona findById(@PathVariable(value = "id", required = true) Long id){
        return personaService.findById(id);
    }

    @GetMapping(value = "/persona/documento/{nroDocumento}")
    public Persona findByNroDocumento(@PathVariable(value = "nroDocumento", required = true) String nroDocumento){
        return personaService.findByNroDocumentoContaining(nroDocumento);
    }

    @GetMapping(value = "/personas")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @DeleteMapping(value = "/persona/{id}")
    public void deleteById(@PathVariable(value = "id", required = true) Long id){
        personaService.deleteById(id);
    }

    @PostMapping(value = "/persona")
    public void insert(@RequestBody Persona persona){
        personaService.save(persona);
    }

    @PutMapping("/persona/{id}")
    public void update(@RequestBody Persona persona,@PathVariable(value = "id",required = true) Long id){
        persona.setId(id);
        personaService.update(persona);
    }
}
