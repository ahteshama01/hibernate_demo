package hibernate_demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class demo {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
			System.out.println(emf);
		}
}
