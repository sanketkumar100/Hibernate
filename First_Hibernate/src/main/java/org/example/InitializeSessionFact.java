package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InitializeSessionFact {
    private static final SessionFactory ssf;

    static {
        try {
            // This loads hibernate.cfg.xml from classpath (src/main/resources)
            ssf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Exception e)
        {
            System.out.println("SessionFactory creation failed: " + e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionfactory() {
        return ssf;
    }
}
