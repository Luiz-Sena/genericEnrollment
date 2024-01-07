package com.lhasena.enrollment.entities;

import com.lhasena.enrollment.models.AddressModel;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private LocalDate birthDate;
    @Column
    private AddressModel addressModel;
}
