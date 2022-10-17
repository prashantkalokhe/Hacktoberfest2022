

 #include <stdio.h>
#include <conio.h>
#include<time.h>
#include<unistd.h>
int main()
{
    time_t begin = time(NULL);
    int a[100],b[100],i,n,j,k,temp,count=0;
    printf("");
    printf("\n Enter size of the  array : ");
    scanf("%d", &n);
    printf("\nEnter elements in array : ");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
        if(a[i]%2==1)
         count++;
    }
    for(i=0; i<n-1; i++)
    {
        for(j=0; j<n-i-1; j++)
        {
           if(a[j]>a[j+1])
           {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
  }
        }
    }  
k=0;
    j=n-count;
for(i=0; i<n; i++)
    {
        if(a[i]%2==0)
        {
        if(k<n-count)
         b[k++]=a[i];
}  
else
{
if(j<n)
         b[j++]=a[i];
   }
    }  
    printf("\n Array after sorting even and odd elements separately are :\n ");
    for(i=0; i<n; i++)
    {
    a[i]=b[i];
       printf("%d ",a[i]);
    }
    time_t end = time(NULL);
    printf("\n\n The Execution time is %d seconds", (end - begin));
}


