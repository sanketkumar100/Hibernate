package org.example;

import jakarta.persistence.*;

@Entity
public class Passport
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passportNumber;

    public Passport()
    {
    }

    public Passport(String passportNumber)
    {
        this.passportNumber = passportNumber;
    }

    // Getters and Setters
    public Long getId()
    {
        return id;
    }

    public String getPassportNumber()
    {
        return passportNumber;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setPassportNumber(String passportNumber)
    {
        this.passportNumber = passportNumber;
    }
}
