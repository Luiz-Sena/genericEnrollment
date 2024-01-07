package com.lhasena.enrollment.dao;

import com.lhasena.enrollment.entity.FormPersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormPersonRepository extends CrudRepository<FormPersonEntity, Long> {

    FormPersonEntity findFormPersonByEnrollment(String enrollment);

}
