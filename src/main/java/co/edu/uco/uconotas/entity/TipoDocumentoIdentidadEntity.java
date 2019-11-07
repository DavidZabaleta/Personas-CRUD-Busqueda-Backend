package co.edu.uco.uconotas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@Table(name = "tipodocumentoidentidad")
public class TipoDocumentoIdentidadEntity {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "activo")
    private boolean activo;

    public TipoDocumentoIdentidadEntity(){}

}
