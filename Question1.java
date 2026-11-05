class Question1
{
	public static void main (String [] args)
	{
		int br [] = {7,2,5,8,12,16,23,28,28,16};
		int tar = 12;
		
		LinearSearch ls = new linearSearch();
		int res = ls.linearSearch(br,tar);
		
		if(res==-1)
		{
			System.out.println("Invalid Target");
		}
		else 
		{
			System.out.println("Indetx is : "+ res);
		}
	}
	int linearSearch(int ar[], int target)
	{
		for(int i =0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}