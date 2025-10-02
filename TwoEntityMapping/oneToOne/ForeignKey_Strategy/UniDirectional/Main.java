package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = InitializeSessionFact.getSessionfactory().openSession();
        Transaction tx = session.beginTransaction();

        // Create Passport
        Passport passport = new Passport("A1234567");

        // Create Employee with Passport
        Employee employee = new Employee("John Doe", passport);

        // Save employee (also saves passport if cascade is set)
        session.persist(passport);  // required if no CascadeType.ALL
        session.persist(employee);

        tx.commit();
        session.close();

        System.out.println("Employee saved with ID: " + employee.getId());
        System.out.println("Passport saved with ID: " + passport.getId());
    }
}
