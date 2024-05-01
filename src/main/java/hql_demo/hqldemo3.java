package hql_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class hqldemo3 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query query=em.createQuery("select e.name,e.salary from Employee e");
		List<Object[]> datas=query.getResultList();
		
		for(Object[] obj:datas) {
			String names=(String)obj[0];
			double salarys=(Double)obj[1];
			System.out.println(names+" "+salarys);
		}
	}
}
