class Main 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		int choice;
		 
		do 
		{
			System.out.println("\n===== Student Management System =====");
			System.out.println("1. Add Student Details");
			System.out.println("2. Display Student Details");
			System.out.println("3. Update Student Age");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
			System.out.print("Enter ID: ");
			sc.nextLine();
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			s.addStudent(id, name, age);
			System.out.println("Student details added!");
			break;
			
			case 2:
			s.displayStudent();
			break;
			
			case 3:
			System.out.print("Enter new Age: ");
			int newAge = sc.nextInt();
			s.updateAge(newAge);
			System.out.println("Age updated!");
			break;
			
			case 4:
			 System.out.println("Exiting...");
			 break;
			 
			default: 
			  System.out.println("Invalid choice!");
			}
		}while (choice != 4);

		sc.close();
	}
}