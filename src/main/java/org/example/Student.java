package org.example;

import jakarta.persistence.*;

@Entity
public class Student
{
    @Id
    private long id;
    private String name;

    public Student()
    {
        super();
    }
    public Student(long id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public long getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}
