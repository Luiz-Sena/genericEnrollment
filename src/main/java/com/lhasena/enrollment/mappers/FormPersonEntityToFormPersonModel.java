package com.lhasena.enrollment.mappers;

import com.lhasena.enrollment.entities.FormPersonEntity;
import com.lhasena.enrollment.models.FormPersonModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class FormPersonEntityToFormPersonModel {

    @Autowired
    private ModelMapper modelMapper;

    public FormPersonModel map(FormPersonEntity formPersonEntity){
        return modelMapper.map(formPersonEntity, FormPersonModel.class);
    }

}
