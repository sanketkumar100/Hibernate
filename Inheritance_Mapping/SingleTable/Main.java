package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        // Open session & transaction
        Session sess = InitializeSessionFact.getSessionfactory().openSession();
        Transaction tx = sess.beginTransaction();

        // Create Manager object
        Manager mgr = new Manager();
        mgr.setName("Alice");       // parent field
        mgr.setBonus(5000.0);       // manager field

        // Create Developer object
        Developer dev = new Developer();
        dev.setName("Bob");                     // parent field
        dev.setProgrammingLanguage("Java");     // developer field

        // Persist objects
        sess.persist(mgr);
        sess.persist(dev);

        // Commit transaction
        tx.commit();
        sess.close();

        // Print confirmation
        System.out.println("Entities saved:");
        System.out.println("Manager ID: " + mgr.getId() + " | Name: " + mgr.getName() + " | Bonus: " + mgr.getBonus());
        System.out.println("Developer ID: " + dev.getId() + " | Name: " + dev.getName() + " | Language: " + dev.getProgrammingLanguage());
    }
}
