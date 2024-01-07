package com.lhasena.enrollment.mapper;

import com.lhasena.enrollment.entity.FormPersonEntity;
import com.lhasena.enrollment.dto.FormPersonDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class FormPersonEntityToFormPersonDTO implements Function<FormPersonEntity, FormPersonDTO> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public FormPersonDTO apply(FormPersonEntity formPersonEntity){
        return modelMapper.map(formPersonEntity, FormPersonDTO.class);
    }

}
