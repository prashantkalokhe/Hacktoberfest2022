#include <stdio.h>
#include <math.h>
#include <conio.h>
#define MAX 20
int jump_search(int a[], int low, int high, int val, int n)
{
int step, i;
step = sqrt(n);
for(i=0;i<step;i++)
{
if(val < a[step])
high = step – 1;
 else
low = step + 1;
}
for(i=low;i<=high;i++)
{
    if(a[i]==val)
  return i;
}
return –1;
}
int main()
{
int arr[MAX], i, n, val, pos;
// clrscr();
printf("\n Enter the number of elements in the array : ");
scanf("%d", &n);
printf("\n Enter the elements : ");
for(i = 0; i <n; i++)
scanf("%d", &arr[i]);
printf("\n Enter the value to be searched : ");
scanf("%d", &val);
pos = jump_search(arr, 0, n–1, val, n);
if(pos == –1)
printf("\n %d is not found in the array", val);
else
printf("\n %d is found at position %d", val, pos);
// getche();
return 0;
}
