package student_app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class student_methods {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo1");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

public void addstudent(student st) {
	
	et.begin();
	em.persist(st);
	et.commit();
}

public student findbyid(int id) {
	
	
	return em.find(student.class,id );
	
}

public List<student> findallstudent() {
	Query query=em.createQuery("select s from student s");
	return query.getResultList();
	
	
}

public void updatestudent(student st) {
	et.begin();
	em.merge(st);
	et.commit();
}

public void removeStudent(int id) {
	et.begin();
	student st=em.find(student.class, id);
	if(st!=null) {
		em.remove(id);
	}else {
		System.out.println("No DATA AVAILABLE");
	}
	
	et.commit();
}

public List<student> bypercentage(double percentage){
	Query query=em.createQuery("select s from student s where s.percentage=:percentage");
	query.setParameter("percentage", percentage);
	return query.getResultList();
	
}

}
