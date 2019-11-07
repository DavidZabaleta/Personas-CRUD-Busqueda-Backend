package co.edu.uco.uconotas.controller;

import co.edu.uco.uconotas.entity.TipoDocumentoIdentidadEntity;
import co.edu.uco.uconotas.model.TipoDocumentoDeIdentidad;
import co.edu.uco.uconotas.service.persona.impl.TipoDocumentoIdentidadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tipo-documento-identidad")
@CrossOrigin(origins = "https://localhost:4200")
public class TipoDocumentoIdentidadController {

    @Autowired
    TipoDocumentoIdentidadServiceImpl tipoDocumentoIdentidadService;

    @GetMapping(value = "/tipos-documento-identidad")
    public List<TipoDocumentoIdentidadEntity> findAll(){
        return tipoDocumentoIdentidadService.findAll();
    }
}
