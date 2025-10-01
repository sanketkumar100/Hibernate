package org.example;

import jakarta.persistence.Entity;

@Entity
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        // required for JPA
    }

    public Developer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
