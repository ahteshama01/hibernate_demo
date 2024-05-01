package crud_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_demo.Employee;

public class crudDemo {
		public static void main(String[] agrs) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
//			Employee emp1=new Employee(1,"shubham",2000);
//			Employee emp2=new Employee(2,"prince",2000);
			Employee emp3=new Employee(3,"tasneem",2000);
			
			et.begin();
//			em.persist(emp1);
//			em.persist(emp2);
			em.persist(emp3);
			et.commit();
			
			//em.persist(emp3);  ///this data will not be saved in table
			System.out.println("Data Inserted");
			
			
		}
}
