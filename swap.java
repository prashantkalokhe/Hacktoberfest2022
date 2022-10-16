import java.util.Scanner;
 class swap
 {
      static Scanner sc = new Scanner(System.in);
      static int n =sc.nextInt();
     public static void main(String args[])
     {
     System.out.println("The no of elements to be inserted in an array are : " +n);  
     int a[] = read();
     System.out.println("Before swapping array elemrnts are : ");
     display(a);
     int maxpos = max(a,n);
     int minpos = min(a,n);
     swap(a,maxpos,minpos);
     System.out.println("After swapping array elemrnts are : ");
     display(a);
     }
 static int[] read()
 {
   
     int a[] = new int[n];
     System.out.println("Enter values of elemrnts : ");
     for (int i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
     return a;
 }
 
 static void display(int a[])
 {
     for(int i=0;i<a.length;i++)
     {
         System.out.println(a[i]+" ");
     }
 }
 static int max(int a[],int n)
 {
     int i, pos=0, max = a[0];
     for(i=0;i<n;i++)
     {
         if(a[i]>max)
         {
         max=a[i];
         pos=i;
         }
     }
      return pos;
     }
     static int min(int a[],int n)
 {
     int i, pos=0, min = a[0];
     for(i=0;i<n;i++)
     {
         if(a[i]<min)
         {
         min=a[i];
         pos=i;
         }
     }
      return pos;
     }
 static void swap(int a[], int maxpos, int minpos)
 {
   int temp;
   temp=a[maxpos];
   a[maxpos]=a[minpos];
   a[minpos]=temp; 
 }
 }
