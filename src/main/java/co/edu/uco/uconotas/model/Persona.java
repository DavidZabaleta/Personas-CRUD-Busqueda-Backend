package co.edu.uco.uconotas.model;

import lombok.Data;

import java.util.Date;

@Data
public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
    private TipoDocumentoDeIdentidad tipoDocumentoIdentidad;
    private Long idDocumentoIdentidad;
    private String nroDocumento;
    private String telefono;
    private String fechaNacimiento;
}
