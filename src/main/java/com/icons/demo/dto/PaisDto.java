package com.icons.demo.dto;

import com.icons.demo.entities.ContinenteEntity;
import com.icons.demo.entities.IconsEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PaisDto {

    private String id;

    private String imagen;

    private String denominacion;

    private String cantidadHabitantes;

    private String superficie;

    private ContinenteEntity continenteEntity;

    private String ContinenteId;

    private Set<IconsEntity> icons;

    {
        icons = new HashSet<>();
    }
}
