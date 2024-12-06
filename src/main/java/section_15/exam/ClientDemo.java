package section_15.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        
        session.beginTransaction();
        
        // Creating Device objects
        Device device = new Device("Samsung", "Galaxy S21", 799.99);
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 999.99, "iOS", 12);
        Tablet tablet = new Tablet("Lenovo", "Tab P11", 259.99, 11.0, 10);

        // Persisting the objects
        session.save(device);
        session.save(smartphone);
        session.save(tablet);
        
        session.getTransaction().commit();
        session.close();
        factory.close();

        System.out.println("Records inserted successfully!");
    }
}

