// 1.8 Write a program to display an array of n integers (n>1), where at every index of the
// array should contain the product of all elements in the array except the element at the
// given index. Solve this problem by taking single loop and without an additional array.
// Input Array : 3 4 5 1 2
// Output Array :40 30 24 120 60


#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int pro(int ar[],int n)
{
   int p=1;
   for(int i=0;i<n;i++)
   {
   p=ar[i]*p;
   }
   for(int i=0;i<n;i++)
   {
   ar[i]=p/ar[i];
   }
printf("\nOUTPUT ARRAY=");
   for(int i=0;i<n;i++)
{
    printf("%d ",ar[i]);
}

return 0;
}


int main() {
int n;
printf("Enter Array Size=");
scanf("%d",&n);
int ar[n];

for (int i = 0; i < n; ++i) {
   ar[i]=i+1;
  }
printf("INPUT ARRAY=");
for(int i=0;i<n;i++)
{
    printf("%d ",ar[i]);
}

clock_t t;
    t = clock();
    pro(ar, n);
    t = clock() - t;
    double time_taken = ((double)t)/CLOCKS_PER_SEC; // in seconds
 
    printf("\npro() function took %f seconds to execute \n", time_taken);
}