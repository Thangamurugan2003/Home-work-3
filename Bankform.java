import java.util.Scanner;
class Bankform
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Display balance");
		System.out.println("4.Exit");
		System.out.print("Enter the option:");
		int opt = sc.nextInt();
		int initialbalance = 1000;
		
		System.out.println();
		Menu m = new Menu();
		
		while(opt<5)
		{
			switch(opt)
			{
				case 1:
				    System.out.print("Intial balance = "+initialbalance);
					System.out.println();
					System.out.print("Enter Amount:");
					int amt = sc.nextInt();
					System.out.println();
					
					m.Deposit(initialbalance,amt);
					System.out.print("Enter the option:");
		            opt = sc.nextInt();
					break;
					
				case 2:
					System.out.print("Enter Withdrawl amt:");
					int withdrawl = sc.nextInt();
					
					m.withdraw(withdrawl);
					System.out.print("Enter the option:");
		            opt = sc.nextInt();
					break;
					
				case 3:
					m.disp();
					System.out.print("Enter the option:");
		            opt = sc.nextInt();
					break;
					
				case 4:
					System.out.print("Exited");
					opt = opt+1;
					break;
			}
        }	
	}
	
}