package com.example.packettracerbase.models;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.time.LocalDate;

@Data
@MappedSuperclass
public abstract class Person {

    protected String username;

    protected String password;

    protected boolean isActive;

    protected String firstName;

    protected String lastName;

    protected String email;

    @Temporal(TemporalType.DATE)
    protected LocalDate dateOfBirth;


}
