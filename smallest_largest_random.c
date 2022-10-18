

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int max(int n, int arr[]);
int min(int n, int arr[]);

int main()
{

    time_t begin = time(NULL);
    int i, n;
    printf("\nEnter the No. of elements : ");
    scanf("%d", &n);
    int arr[n];
    for (i = 0; i < n; i++)
    {
        arr[i] = rand();
    }

    printf("\nDisplay of array elements :- \n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
    int Largest = max(n, arr);
    int smallest = min(n, arr);

    printf("\nMaximum number is : %d", Largest);
    printf("\nMinimum number is  : %d", smallest);

    time_t end = time(NULL);
    printf("\n Time Taken :- %d  nano Sec ", (end - begin));
    printf(" \n Name :- Saiyam Gupta");
    return 0;
}
int max(int n, int arr[])
{
    int ma = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > ma)
            ma = arr[i];
    }
    return ma;
}
int min(int n, int arr[])
{
    int mi = arr[0];
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < mi)
            mi = arr[i];
    }
    return mi;
}