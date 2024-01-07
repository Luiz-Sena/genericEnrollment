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

}
