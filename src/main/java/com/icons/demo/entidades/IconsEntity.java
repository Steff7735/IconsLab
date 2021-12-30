
package com.icons.demo.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author fanny
 */

@Entity
@Table (name = "icons")
@Getter
@Setter
public class IconsEntity {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private String id;
    
    private String imagen;
    
    private String denominacion;
    
    @Column (name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private LocalDate fechaDeCreacion;
    
    private String altura;
    
    private String historia;
    
    private Boolean deleted = Boolean.FALSE;
    
    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<PaisEntity> paises = new ArrayList<>();
}
