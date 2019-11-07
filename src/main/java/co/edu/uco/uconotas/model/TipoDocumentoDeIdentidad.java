package co.edu.uco.uconotas.model;

import lombok.Data;

@Data
public class TipoDocumentoDeIdentidad {
    private Long id;
    private String nombre;
    private String sigla;
    private boolean activo;

}
