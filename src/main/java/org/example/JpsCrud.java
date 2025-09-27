package org.example;

import jakarta.persistence.*;

public class JpsCrud
{
    public static void main(String[] args)
    {
        // 1. Create EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-unit");
        EntityManager em = emf.createEntityManager();

        // 2. Begin transaction
        em.getTransaction().begin();

        // 3. Create & save Student
        Student student = new Student(1L, "Sanket");
        em.persist(student);

        // 4. Find by id
        Student found = em.find(Student.class, student.getId());
        System.out.println("Found Student: " + found.getName());

        // 5. Update
        found = new Student(found.getId(), "Sanket Kumar");  // or use setter if you add one
        em.merge(found);

        // 6. Delete
        em.remove(em.contains(found) ? found : em.merge(found));

        // 7. Commit transaction
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
