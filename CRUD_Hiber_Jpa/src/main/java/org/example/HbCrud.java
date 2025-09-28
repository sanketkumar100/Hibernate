package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class HbCrud {
    public static void main(String[] args) {
        // 1. Get SessionFactory from InitializeSessionFact class
        SessionFactory sess = InitializeSessionFact.getSessionfactory();

        // 2. Open session
        Session session = sess.openSession();

        //or   Transaction tx = null;

        try {
            // 3. Begin transaction
            session.beginTransaction();

            //or   tx = session.beginTransaction();

            // 4. Create & save student
            Student st = new Student(1001L, "Sanket");
            session.save(st);  // INSERT

            // 5. Get by ID
            Student found = session.get(Student.class, st.getId());
            System.out.println("Found Student: " + found.getName());

            // 6. Update - modify the managed entity directly
            found.setName("Sanket Kumar");
            //session.update(found);

            // No need to call session.update(found) because 'found' is managed

            // 7. Delete the entity
            session.delete(found);

            // 8. Commit transaction
            session.getTransaction().commit();

            // or    tx.commit();

            System.out.println("Transaction completed successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
            // DO NOT close factory here — it's shared and should live longer
        }
    }
}
