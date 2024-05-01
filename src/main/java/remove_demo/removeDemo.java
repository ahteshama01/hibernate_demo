package remove_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_demo.Employee;

public class removeDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Employee emp=em.find(Employee.class, 3);
		
		
		et.begin();
		em.remove(emp);
		et.commit();
	}
}
