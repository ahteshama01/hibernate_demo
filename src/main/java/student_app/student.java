package student_app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class student {
	@Id
	private int id;
	private String name;
	private int age;
	private double percentage;
	
	
	public student(int id, String name, int age, double percentage) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	
	public student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
	}	
}
