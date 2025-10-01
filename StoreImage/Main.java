package org.example;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Session sess = InitializeSessionFact.getSessionfactory().openSession();
        Transaction tx = sess.beginTransaction();

        // Read image as byte array
        FileInputStream fis = new FileInputStream("C:\\Users\\sanke\\OneDrive\\Desktop\\JFS\\Hibernate_JPA\\src\\main\\java\\org\\example\\sd.jpg");
        byte[] imageBytes = fis.readAllBytes();
        fis.close();

        // Create entity
        ProfilePicture pic = new ProfilePicture("Profile Pic", imageBytes);

        // Save
        sess.persist(pic);

        tx.commit();
        sess.close();

        System.out.println("Image saved with ID: " + pic.getId());
    }
}
