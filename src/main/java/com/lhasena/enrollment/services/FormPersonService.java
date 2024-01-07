package com.lhasena.enrollment.services;

import com.lhasena.enrollment.entities.FormPersonEntity;
import com.lhasena.enrollment.mappers.FormPersonEntityToFormPersonModel;
import com.lhasena.enrollment.models.FormPersonModel;
import com.lhasena.enrollment.repositories.FormPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Optional.*;

@Service
public class FormPersonService{

    @Autowired
    private FormPersonRepository formPersonRepository;

    @Autowired
    private FormPersonEntityToFormPersonModel formPersonEntityToFormPersonModel;

    public FormPersonModel createFormPerson(FormPersonModel formPerson){
        return new FormPersonModel();
    }

    public FormPersonModel findFormPersonByEnrollment(String enrollment){
        return ofNullable(formPersonRepository.findFormPersonByEnrollment(enrollment))
                .map(formPersonEntityToFormPersonModel::map)
                .orElseGet(FormPersonModel::new);
    }
    public FormPersonModel updateFormPerson(FormPersonModel formPerson){
        return new FormPersonModel();
    }
    public void removeFormPersonByEnrollment(String enrollment){

    }
}
