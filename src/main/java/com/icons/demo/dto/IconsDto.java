package com.icons.demo.dto;

import com.icons.demo.entities.PaisEntity;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class IconsDto {

    private String id;

    private String imagen;

    private String denominacion;

    private LocalDate fechaDeCreacion;

    private String altura;

    private String historia;

    private List<PaisEntity> paises;

    {
        paises = new ArrayList<>();
    }
}
