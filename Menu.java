class Menu
{
	int initialamt;
	int amt;
	int with;
	int tot;
	
	void Deposit(int ini,int a)
	{
		initialamt = ini;
		amt = a;
		tot = initialamt+amt;
		
		System.out.println("Total Amount in your Acc: "+tot);
		
	}
	
	void withdraw(int with)
	{
		tot = tot-with;
		System.out.println("Total Amount in your Acc: "+tot);
	}
	
	void disp()
	{
		System.out.println("Total Amount in your Acc: "+tot);
	}
	
}