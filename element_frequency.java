import java.util.Scanner;
class frequency {
    public static void main(String agrs[]) {
            Scanner sc = new Scanner(System.in);
           System.out.println("Enter array size");
           int n=sc.nextInt();
           int a[]=new int[n];
           System.out.println("Enter array");
           for(int i=0;i<n;i++)
           {
               System.out.println("Enter array at position"+i+":");
             a[i] = sc.nextInt();
           }
            int c=0;
        for (int i=0;i<n;i++)
        {
                c=0;
            for(int j=0;j<n;j++)
            {
                if(i==a[j])
                {
                    c++;
                }
                 
            }
        if(c!=0)
        {
            System.out.println("Frequency of"+i+"="+c);
        }
        }
            
            
    }
}
