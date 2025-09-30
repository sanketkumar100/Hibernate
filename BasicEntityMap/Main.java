package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Session sess = InitializeSessionFact.getSessionfactory().openSession();
        Transaction tx = sess.beginTransaction();

        // Create and populate embedded NewClass object
        NewClass prp = new NewClass();
        prp.setGreet("Hello");
        prp.setNewProperty(123);

        // Create MapEntity object and set fields
        MapEntity obj = new MapEntity();
        obj.setName("Sanket");
        obj.setPhno(1234567890L);  // transient field, won't be saved in DB
        obj.setDt(new Date());
        obj.setDa(Days.Monday);
        obj.setPrp(prp);

        // Save entity
        sess.save(obj);

        tx.commit();
        sess.close();

        System.out.println("Entity saved in DB with id: " + obj.getId());
    }
}
