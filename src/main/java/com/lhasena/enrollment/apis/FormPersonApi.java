package com.lhasena.enrollment.apis;

import com.lhasena.enrollment.models.FormPersonModel;

public interface FormPersonApi {

    FormPersonModel createFormPerson(FormPersonModel formPerson);
    FormPersonModel findFormPersonByEnrollment(String enrollment);
    FormPersonModel updateFormPerson(FormPersonModel formPerson);
    void removeFormPersonByEnrollment(String enrollment);
}
