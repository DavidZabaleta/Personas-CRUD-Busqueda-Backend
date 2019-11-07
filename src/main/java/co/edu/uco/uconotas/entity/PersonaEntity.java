package co.edu.uco.uconotas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "persona")
public class PersonaEntity{

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @ManyToOne
    @JoinColumn(name ="idDocumentoIdentidad", insertable = false, updatable = false)
    private TipoDocumentoIdentidadEntity tipoDocIdentidad;
    @Column(name="idDocumentoIdentidad")
    private Long idDocumentoIdentidad;
    @Column(name="nroDocumento")
    private String nroDocumento;
    @Column(name="telefono")
    private String telefono;
    @Column(name = "fechaNacimiento")
    private String fechaNacimiento;
}
