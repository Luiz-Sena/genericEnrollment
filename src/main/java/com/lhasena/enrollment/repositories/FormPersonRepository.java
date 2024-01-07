package com.lhasena.enrollment.repositories;

import com.lhasena.enrollment.entities.FormPersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormPersonRepository extends CrudRepository<FormPersonEntity, Long> {

    FormPersonEntity findFormPersonByEnrollment(String enrollment);

}
