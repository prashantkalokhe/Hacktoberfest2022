import java.util.*;
class Spiral_automorphic
{
	public static boolean automorphic(int num)
	{
		int cpy=num;
		int sq = num*num;
		int p=1;
		while(num>0)
		{
			p=p*10;
			num=num/10;
		}
		int l=sq%p;
		if(l==cpy)
			return true;
		return false;	
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][]=new int[m][n];
		int outarr[]=new int[m*n];
		int num=1,k=0;
		int r1=0,r2=m-1,c1=0,c2=n-1;
		int temp=0;
		while(num<=m*n)//1+2+3
		{
			
			for(int i=r1;i<=r2;i++)
			{
				temp+=num;
				if(automorphic(temp)==true && temp>1)
				{
					outarr[k++]=temp;
					temp=0;
				}
				arr[i][c1]=num++;
			}
			
			for(int j=c1+1;j<=c2;j++)
			{
				temp+=num;
				if(automorphic(temp)==true && temp>1)
				{
					outarr[k++]=temp;
					temp=0;
				}
				 arr[r2][j]=num++;
			}
			 
			for(int i=r2-1;i>=r1;i--)
			{
				temp+=num;
				if(automorphic(temp)==true && temp>1)
				{
					outarr[k++]=temp;
					temp=0;
				}
				arr[i][c2]=num++;
			}
			
			for(int j=c2-1;j>=c1+1;j--)
			{
				temp+=num;
				if(automorphic(temp)==true && temp>1)
				{
					outarr[k++]=temp;
					temp=0;
				}
				 arr[r1][j]=num++; 
			}
			r1++;
			r2--;
			c1++;
			c2--;
		}
		System.out.println("Matrix Form");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Content of array : ");
		for(int i=0;i<k;i++)
			 System.out.print(outarr[i]+" ");
	}
	
}