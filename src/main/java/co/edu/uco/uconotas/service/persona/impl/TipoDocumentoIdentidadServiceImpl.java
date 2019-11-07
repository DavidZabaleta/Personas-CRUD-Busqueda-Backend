package co.edu.uco.uconotas.service.persona.impl;

import co.edu.uco.uconotas.entity.TipoDocumentoIdentidadEntity;
import co.edu.uco.uconotas.repository.TipoDocumentoIdentidadRepository;
import co.edu.uco.uconotas.service.persona.TipoDocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoIdentidadServiceImpl implements TipoDocumentoIdentidadService {

    @Autowired
    TipoDocumentoIdentidadRepository tipoDocumentoIdentidadRepository;

    @Override
    public List<TipoDocumentoIdentidadEntity> findAll() {
        return tipoDocumentoIdentidadRepository.findAll();
    }
}
