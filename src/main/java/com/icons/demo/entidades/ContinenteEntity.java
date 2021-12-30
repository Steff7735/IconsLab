
package com.icons.demo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author fanny
 */
@Entity
@Table( name = "continente" )
@Getter
@Setter

public class ContinenteEntity {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
    
    private String imagen;
    
    private String denominacion;
    
}
