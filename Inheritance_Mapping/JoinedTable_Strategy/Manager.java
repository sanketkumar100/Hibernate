package org.example;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
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

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
