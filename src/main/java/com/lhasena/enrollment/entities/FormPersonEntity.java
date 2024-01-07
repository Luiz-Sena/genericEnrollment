package com.lhasena.enrollment.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "formPerson")
public class FormPersonEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column
    private String enrollment;
    @Column
    private PersonEntity formPerson;
    @Column
    private LocalDateTime registrationLocalDateTime;
    @Column
    private LocalDateTime lastUpdated;
    @Column(name = "CREATED_AT", nullable = false, updatable = false,
            insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    public FormPersonEntity() {}

    public FormPersonEntity(Long id, String enrollment, PersonEntity formPerson, LocalDateTime registrationLocalDateTime, LocalDateTime lastUpdated, Timestamp createdAt) {
        this.id = id;
        this.enrollment = enrollment;
        this.formPerson = formPerson;
        this.registrationLocalDateTime = registrationLocalDateTime;
        this.lastUpdated = lastUpdated;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public PersonEntity getFormPerson() {
        return formPerson;
    }

    public void setFormPerson(PersonEntity formPerson) {
        this.formPerson = formPerson;
    }

    public LocalDateTime getRegistrationLocalDateTime() {
        return registrationLocalDateTime;
    }

    public void setRegistrationLocalDateTime(LocalDateTime registrationLocalDateTime) {
        this.registrationLocalDateTime = registrationLocalDateTime;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
