package org.example;
@Entity
@DiscriminatorValue("DVR")    
public class Developer extends Employee
{
    private String programmingLanguage;
    public Developer()   //used to instantiate object while fething from DB
    {

    }
    public Developer(String programmingLanguage)
    {
        this.programmingLanguage=programmingLanguage;
    }
}
