class Question2
{
	public static void main (String [] args)
	{
		int br[] = {5,10,20,30,40,50,30};
		int tar = 20;
		
		BinarySearch bs = new BinarySearch();
		
		int res = bs.binarySearch(br,tar);
		
		if(res==-1)
		{
			System.out.println("Invalid Target");
		}
		else 
		{
			System.out.println("Indetx is : "+ res);
		}
	}
	int binarySearch(int ar[], int target)
	{
		int start = 0;
		int end = ar.length;
		int mid = 0;
		
		while(start<end)
		{
			mid = (start+end)/2;
			
			if(ar[mid]==target)
			{
				return mid;
			}
			else if(ar[mid]<target)
			{
				start = mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
		return -1;
	}
}