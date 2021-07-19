package com.krutika.Hibernate_Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.pojo.Registry_emp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
       cfg.configure("com\\employee\\config\\hibernate.cfg.xml");
       System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
       SessionFactory factory = cfg.buildSessionFactory();
       Session ses = factory.openSession();
       Transaction tx = ses.beginTransaction();
       
       Registry_emp employee = new Registry_emp();
       employee.setEmpID(103);
       employee.setEmpName("Satwik");
       employee.setEmpAdd("London");
       employee.setEmpGender("male");
       
       //ses.update(employee);
       
       Integer id =(Integer)ses.save(employee);
       System.out.println("Generated identifier is: "+id);
       
       tx.commit();
       
       
    }
}
