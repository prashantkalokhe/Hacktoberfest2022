import java.util.Scanner;
public class heap_sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int x[]=heapsort(a);
		print(x);
	}
	public static int[] heapsort(int a[])
	{
		for(int i=a.length-1/2;i>=0;i--)
			heapify(a,i);
		int x[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			x[i]=a[0];
			a[0]=Integer.MIN_VALUE;
			heapify(a,0);
		}
		return x;
	}
	public static void heapify(int a[],int i)
	{
		if(i*2+1>=a.length)
			return;
		int left=a[i*2+1];
		int right=Integer.MIN_VALUE;
		if(i*2+2<a.length)
			right=a[i*2+2];
		if(a[i]<left&&left>=right)
		{
			a[i*2+1]=a[i];
			a[i]=left;
			heapify(a,i*2+1);
		}
		else if(a[i]<right)
		{
			a[i*2+2]=a[i];
			a[i]=right;
			heapify(a,i*2+2);
		}
	}
	public static void print(int a[])
	{
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
	}
}
