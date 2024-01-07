package com.lhasena.enrollment.entities;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String street;
    @Column
    private String state;
    @Column
    private String postCode;
    @Column
    private String number;
    @Column
    private String country;
    @Column
    private String complement;
}
