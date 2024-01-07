package com.lhasena.enrollment.service;

import com.lhasena.enrollment.mapper.FormPersonEntityToFormPersonDTO;
import com.lhasena.enrollment.dto.FormPersonDTO;
import com.lhasena.enrollment.dao.FormPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Optional.*;

@Service
public class FormPersonService{

    @Autowired
    private FormPersonRepository formPersonRepository;

    @Autowired
    private FormPersonEntityToFormPersonDTO formPersonEntityToFormPersonDTO;

    public FormPersonDTO createFormPerson(FormPersonDTO formPerson){
        return new FormPersonDTO();
    }

    public FormPersonDTO findFormPersonByEnrollment(String enrollment){
        return ofNullable(formPersonRepository.findFormPersonByEnrollment(enrollment))
                .map(formPersonEntityToFormPersonDTO)
                .orElseGet(FormPersonDTO::new);
    }
    public FormPersonDTO updateFormPerson(FormPersonDTO formPerson){
        return new FormPersonDTO();
    }
    public void removeFormPersonByEnrollment(String enrollment){

    }
}
