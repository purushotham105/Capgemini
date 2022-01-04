package hibernate.assignment.assignmentTwo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
        		System.out.println("Connection Started");
        		Configuration cf =new Configuration();
        		cf.configure("hibernate.cfg.xml");
        		SessionFactory sf = cf.buildSessionFactory();
        		//object of Employee class
        		Groceries item = new Groceries();
        		item.setItemName("Rice");
        		item.setItemCost(2000);
        		item.setItemWeight(2.0);
        		
        		Session sess = sf.openSession();
        		Transaction tx = sess.beginTransaction();
        		sess.save(item);
        		//commit the changes before close
        		tx.commit();
        		System.out.println("Transaction is commited");
        		
        		//session is closed
        		sess.close();
        		System.out.println("Session is closed");
        		System.out.println("End of java Code");
        	}

   
}

