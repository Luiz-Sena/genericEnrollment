package com.lhasena.enrollment.entities;

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
    private AddressEntity address;
    @Column
    private String gender;

    public PersonEntity() {
    }

    public PersonEntity(Long id, String name, String lastName, LocalDate birthDate, AddressEntity address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public AddressEntity getAddress() {
        return this.address;
    }

    public void setAddressModel(AddressEntity address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
