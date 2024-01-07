package com.lhasena.enrollment.controller;

import com.lhasena.enrollment.api.FormPersonApi;
import com.lhasena.enrollment.dto.FormPersonDTO;
import com.lhasena.enrollment.service.FormPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/form-person")
public class FormPersonController implements FormPersonApi {

    @Autowired
    private FormPersonService formPersonService;

    @PostMapping
    public FormPersonDTO createFormPerson(FormPersonDTO formPerson){
        return new FormPersonDTO();
    }
    @GetMapping("/{enrollment}")
    public FormPersonDTO findFormPersonByEnrollment(@PathVariable String enrollment){
        return new FormPersonDTO();
    }
    @PutMapping
    public FormPersonDTO updateFormPerson(FormPersonDTO formPerson){
        return new FormPersonDTO();
    }
    @DeleteMapping("/{enrollment}")
    public void removeFormPersonByEnrollment(@PathVariable String enrollment){

    }
}
