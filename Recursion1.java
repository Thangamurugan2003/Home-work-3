import java.util.Scanner;
class Recursion1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		System.out.println("Enter the array Elements: ");
		int arr[] = new int[size];
		
		for (int i = 0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the Key: ");
		int key = sc.nextInt();
		
		System.out.print("Array: ");
		for (int i = 0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Key: "+key);
		
		Recursion rec = new Recursion();
		int index = 0;
		int res = rec.linearSearch(arr,index,key);
		
		if (res == -1)
		{
			System.out.println("Not Found");
			
		}
		else
		{
			System.out.println("Element found at index: "+res);
		}
		
	}
	
	int linearSearch(int brr[],int i,int keyval)
	{
		
		if(brr[i] == keyval)
		{
			return i;
		}
		
		return linearSearch(brr,i+1, keyval);
		
	}
	
	
}