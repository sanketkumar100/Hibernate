package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main
{
    public static void main(String[] args)
    {
        Session sess=InitializeSessionFact.getSessionfactory().openSession();
        Transaction tx=sess.beginTransaction();

        Student obj=new Student(10846,"Sanket");
        sess.save(obj);

         tx.commit();

        sess.close();
        System.out.println("User saved in DB with id:"+obj.getId());

    }
}