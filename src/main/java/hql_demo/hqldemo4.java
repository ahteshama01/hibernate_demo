package hql_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_demo.Employee;

public class hqldemo4 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query query=em.createQuery("select e from Employee e Where e.id=2");
		List<Employee> emps=query.getResultList();
		for(Employee e:emps) {
			System.out.println(e);
		}
		
		System.out.println("===================================");
		
		Query query1=em.createQuery("select em from Employee em Where em.id in(1,2)");
		List<Employee> emps1=query1.getResultList();
		for(Employee es:emps1) {
			System.out.println(es);
		}
		
		
	}
}
