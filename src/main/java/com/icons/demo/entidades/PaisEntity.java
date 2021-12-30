package com.icons.demo.entidades;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author fanny
 */
@Entity
@Table(name = "pais")
@Getter
@Setter
public class PaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    private String imagen;

    private String denominacion;
    @Column(name = "cantidad_habitantes")

    private String cantidadHabitantes;

    private String superficie;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id", insertable = false, updatable = false)

    private ContinenteEntity continente;
    @Column(name = "continente_id", nullable = false)

    private String ContinenteId;

    @ManyToMany(
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(
            name = "icons_pais",
            joinColumns = @JoinColumn(name = "pais_id"),
            inverseJoinColumns = @JoinColumn (name = "icons_id"))
    
    private Set<IconsEntity> icons = new HashSet<>();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;

        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final PaisEntity other = (PaisEntity) obj;
        return other.id.equals(this.id);

    }

}
