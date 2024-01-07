package com.lhasena.enrollment.controllers;

import com.lhasena.enrollment.apis.FormPersonApi;
import com.lhasena.enrollment.models.FormPersonModel;
import com.lhasena.enrollment.services.FormPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/form-person")
public class FormPersonController implements FormPersonApi {

    @Autowired
    private FormPersonService formPersonService;

    @PostMapping
    public FormPersonModel createFormPerson(FormPersonModel formPerson){
        return new FormPersonModel();
    }
    @GetMapping("/{enrollment}")
    public FormPersonModel findFormPersonByEnrollment(@PathVariable String enrollment){
        return new FormPersonModel();
    }
    @PutMapping
    public FormPersonModel updateFormPerson(FormPersonModel formPerson){
        return new FormPersonModel();
    }
    @DeleteMapping("/{enrollment}")
    public void removeFormPersonByEnrollment(@PathVariable String enrollment){

    }
}
