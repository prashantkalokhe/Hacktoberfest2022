// 4.6 Write a program by using an user defined function to implement merge sort without a
// recursion ( bottom-up version of mergesort) by starting with merging adjacent elements
// of a given array, then merging sorted pairs, and so on.
#include <bits/stdc++.h>
using namespace std;
void merge(int arr[], int l, int m, int r);
int min(int x, int y) { return (x<y)? x :y; }
void mergeSort(int arr[], int n)
{
   int curr_size;

   int left_start;
   for (curr_size=1; curr_size<=n-1; curr_size = 2*curr_size)
   {
       for (left_start=0; left_start<n-1; left_start += 2*curr_size)
       {
           int mid = min(left_start + curr_size - 1, n-1);
           int right_end = min(left_start + 2*curr_size - 1, n-1);
           merge(arr, left_start, mid, right_end);
       }
   }
}
void merge(int arr[], int l, int m, int r)
{
    int i, j, k;
    int n1 = m - l + 1;
    int n2 =  r - m;
    int L[n1], R[n2];
    for (i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[m + 1+ j];

    i = 0;
    j = 0;
    k = l;
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }
    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
}

void printArray(int A[], int size)
{
    int i;
    for (i=0; i < size; i++)
        cout <<" "<< A[i];
    cout <<"\n";
}

int main()
{
    int arr[] = {10,9,8,7,6,1,2,3,4,5};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout <<"Given array is \n ";
    printArray(arr, n);
    mergeSort(arr, n);
    cout <<"\nSorted array is \n ";
    printArray(arr, n);
    return 0;
}