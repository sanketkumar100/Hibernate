package org.example;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")
public class Manager extends Employee
{
    private double bonus;
    public Manager()  //used to instantiate object while fething from DB
    {

    }
    public Manager(double bonus)
    {
        this.bonus=bonus;
    }

}
