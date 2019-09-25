package com.myfirstproject;

import com.myfirstproject.entities.User;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        User user = new User();
        
        user.setId(100);
        user.setName("name");
        user.setSurname("surname");
        user.setPosition("pos");
        user.setSalary(100);
        
        session.save(user);
        
        session.getTransaction().commit();
    }
}