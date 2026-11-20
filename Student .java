import java.util.Scanner;
class Student 
{
	private id;
	private String name;
	private int age;
	
	public void addStudent(int id, String name, int age) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void displayStudent()
	{
		 System.out.println("ID: " + id);
		 System.out.println("Name: " + name);
		 System.out.println("Age: " + age);
	}
	
	 public void updateAge(int age)
	   this.age = age;
}