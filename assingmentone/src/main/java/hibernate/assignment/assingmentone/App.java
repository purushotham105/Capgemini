package hibernate.assignment.assingmentone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        		System.out.println("Connection Started");
        		Configuration cf =new Configuration();
        		cf.configure("hibernate.cfg.xml");
        		SessionFactory sf = cf.buildSessionFactory();
        		//object of Employee class
        		Employee emp = new Employee();
        		emp.setId(121);
        		emp.setName("Santosh");
        		emp.setSalary(27000);
        		
        		Session sess = sf.openSession();
        		Transaction tx = sess.beginTransaction();
        		sess.save(emp);
        		//commit the changes before close
        		tx.commit();
        		System.out.println("Transaction is commited");
        		
        		//session is closed
        		sess.close();
        		System.out.println("Session is closed");
        		System.out.println("End of java Code");
        	}

   
}
