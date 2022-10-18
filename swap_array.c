#include<stdio.h>
int main()
{
    int i,j,n,lst;
    printf("Enter size:"); 
    scanf("%d",&n);
    int size;
    if(n%2!=0)
        size=n-1;
    else
        size=n;
    int a[n];
    printf("Enter array elements:");
    for(i=0;i<n;i++) 
    { 
        scanf("%d",&a[i]); 
    } 
    if(n%2!=0)
    {
        size=n-1;
        lst=a[n-1];
    }
    else{
        size=n;
    }
    int temp;
    for(i=0;i<size;i+=2)
    {   
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
    printf("SWAPPED ARRAY:\n");
    for(int x=0;x<size;x++)
    {
        printf("%d \t",a[x]);
    }
    if(n%2!=0)
    printf("%d", lst);
}
