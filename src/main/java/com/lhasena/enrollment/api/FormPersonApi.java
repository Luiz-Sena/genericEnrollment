package com.lhasena.enrollment.api;

import com.lhasena.enrollment.dto.FormPersonDTO;

public interface FormPersonApi {

    FormPersonDTO createFormPerson(FormPersonDTO formPerson);
    FormPersonDTO findFormPersonByEnrollment(String enrollment);
    FormPersonDTO updateFormPerson(FormPersonDTO formPerson);
    void removeFormPersonByEnrollment(String enrollment);
}
