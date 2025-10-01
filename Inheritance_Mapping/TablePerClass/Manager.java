package org.example;

import jakarta.persistence.Entity;

@Entity
public class Manager extends Employee {
    private double bonus;

    public Manager() {
        // required for JPA
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
