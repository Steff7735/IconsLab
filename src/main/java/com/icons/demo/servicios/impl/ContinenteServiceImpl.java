package com.icons.demo.servicios.impl;

import com.icons.demo.dto.ContinenteDto;
import com.icons.demo.entities.ContinenteEntity;
import com.icons.demo.mapper.ContinenteMapper;
import com.icons.demo.repository.ContinenteRepository;
import com.icons.demo.servicios.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinenteServiceImpl implements ContinenteService {

    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepository continenteRepository;

    public ContinenteDto save(ContinenteDto dto){
        ContinenteEntity entity = continenteMapper.continenteDto2Entity(dto);
        ContinenteEntity entitySaved = continenteRepository.save(entity);
        ContinenteDto result = continenteMapper.continenteEntity2Dto(entitySaved);

        return result;

    }
}
