package com.lhasena.enrollment.services;

import com.lhasena.enrollment.apis.FormPersonApi;
import com.lhasena.enrollment.models.FormPersonModel;
import com.lhasena.enrollment.repositories.FormPersonRepository;
import org.springframework.stereotype.Service;

@Service
public class FormPersonService implements FormPersonApi {

    private FormPersonRepository formPersonRepository;

    public FormPersonModel createFormPerson(FormPersonModel formPerson){
        return new FormPersonModel();
    }
    public FormPersonModel findFormPersonByEnrollment(String enrollment){
        return new FormPersonModel();
    }
    public FormPersonModel updateFormPerson(FormPersonModel formPerson){
        return new FormPersonModel();
    }
    public void removeFormPersonByEnrollment(String enrollment){

    }
}
