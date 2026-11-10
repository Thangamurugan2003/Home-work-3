import java.util.Scanner;
class Recursion2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		System.out.println("Enter the sorted array Elements: ");
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
		
		Recursion2 rec = new Recursion2();
		
		int start = 0;
		int end = arr.length-1;
		int res = rec.binarySearch(arr,start,end,key);
		
		if (res == -1)
		{
			System.out.println("Not Found");
			
		}
		else
		{
			System.out.println("Element found at index: "+res);
		}
		
	}
	
	int binarySearch(int brr[],int st,int en,int keyval)
	{
		
		int mid = ((st+en)/2);
		if(brr[mid] == keyval)
		{
			return mid;
		}
		else if(brr[mid] > keyval)
		{
			st = mid + 1;
			binarySearch(brr,st,en, keyval);
		}
		
		return binarySearch(brr,st,en+1, keyval);
		
	}
	
	
}