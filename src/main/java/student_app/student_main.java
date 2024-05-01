package student_app;

import java.util.List;
import java.util.Scanner;

public class student_main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		student_methods sm=new student_methods();
		
		while(true) {
			System.out.println("\nChoose an operation");
			System.out.println("1.Add Student");
			System.out.println("2.Find Student");
			System.out.println("3.Remove Student");
			System.out.println("4.Update Student");
			System.out.println("5.Find All Student");
			System.out.println("6.Find Student According To Student");
			System.out.println("7.Exit");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice){
				case 1:
					System.out.println("Enter Student Id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Student Name");
					String name=sc.nextLine();
					System.out.println("Enter Student Age");
					int age=sc.nextInt();
					System.out.println("Enter Student Percentage");
					double percentage=sc.nextDouble();
					
					student st=new student();
					st.setId(id);
					st.setName(name);
					st.setAge(age);
					st.setPercentage(percentage);
					sm.addstudent(st);
					System.out.println("Student Added Successfully");
					break;
					
				case 2:
					
					System.out.println("Enter Student ID To Find ");
					int findbyid=sc.nextInt();
					sm.findbyid(findbyid);
					System.out.println("Student Fetched sucessfully");
					break;
				case 3:
					System.out.println("Enter Student ID To Remove ");
					int findid=sc.nextInt();
					sm.removeStudent(findid);
					System.out.println("Student removed sucessfully");
					break;
				case 4:
					System.out.println("Enter Student ID To Update ");
					int idup=sc.nextInt();
					student update=sm.findbyid(idup);
					if(update!=null) {
						System.out.println("Enter Name ");
							String updname=sc.nextLine();
						System.out.println("Enter Age");
							int updage=sc.nextInt();
						System.out.println("Enter percantage ");
						double updpercentage=sc.nextDouble();
						
						update.setName(updname);
						update.setAge(updage);
						update.setPercentage(updpercentage);
						sm.updatestudent(update);
						System.out.println("Student removed sucessfully");
					}else {
						System.out.println("Student Not Found");
					}
					break;
				case 5:
					System.out.println("All Students ");
					sm.findallstudent().forEach(System.out::println);					
					break;
					
				case 6:
					System.out.println("Enter percentage to find student ");
					double pfind=sc.nextInt();
					List<student> bypercentage=sm.bypercentage(pfind);
					if(!bypercentage.isEmpty()) {
						System.out.println("student percentage"+pfind+":");
						bypercentage.forEach(System.out::println);
					}
					else {
						System.out.println("No students present");
					}
					break;
				case 7:
					sc.close();
					System.out.println("Thank you!");
					System.exit(0);
					default:
						System.out.println("Invalid chooise!");
						System.out.println("Thank You!");
			}
			
		}
	}

	
}
