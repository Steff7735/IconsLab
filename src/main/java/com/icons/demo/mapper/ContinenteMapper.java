package com.icons.demo.mapper;

import com.icons.demo.dto.ContinenteDto;
import com.icons.demo.entities.ContinenteEntity;
import org.springframework.stereotype.Component;

@Component
public class ContinenteMapper {

    public ContinenteEntity continenteDto2Entity(ContinenteDto dto){
        ContinenteEntity continenteEntity = new ContinenteEntity();
        continenteEntity.setImagen(dto.getImagen());
        continenteEntity.setDenominacion(dto.getDenominacion());
        return continenteEntity;

    }

    public ContinenteDto continenteEntity2Dto(ContinenteEntity entity){
        ContinenteDto continenteDto = new ContinenteDto();
        continenteDto.setId(entity.getId());
        continenteDto.setImagen(entity.getImagen());
        continenteDto.setDenominacion(entity.getDenominacion());
        return continenteDto;
    }
}
