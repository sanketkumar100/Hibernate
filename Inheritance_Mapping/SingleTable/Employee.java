package org.example;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee
{
    @Id
    @GeneratedValue
    private long id;
    private String name;
    public Employee() //used to instantiate object while fething from DB
    {

    }
    public Employee(long id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public long getId() {
        return id;
    }
}
