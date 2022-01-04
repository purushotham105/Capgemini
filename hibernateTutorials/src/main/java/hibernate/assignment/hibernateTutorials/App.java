package hibernate.assignment.hibernateTutorials;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory fty = cfg.buildSessionFactory();
       //creating Fruit class object to initialize
       Fruits fr = new Fruits();
       fr.setFruitName("Mango");
       fr.setCost(5);
       Session session = fty.openSession();
       Transaction tx = session.beginTransaction(); 
       //to save create a session object
       session.save(fr);
       
       
      tx.commit();
      session.close();
      System.out.println("Records Saved");
      
      System.out.println(fty.isClosed());
      System.out.println(fty.isOpen());
      System.out.println(fty);
      
      System.out.println("End of java code");
       
    }
}
