package com.lhasena.enrollment.controllers;

import com.lhasena.enrollment.apis.FormPersonApi;
import com.lhasena.enrollment.models.FormPersonModel;
import com.lhasena.enrollment.services.FormPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/form-person")
public class FormPersonController implements FormPersonApi {

    @Autowired
    private FormPersonService formPersonService;

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
