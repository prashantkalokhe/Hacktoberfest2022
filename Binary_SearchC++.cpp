//program of binary search using iteration method
#include <bits/stdc++.h>

using namespace std;
int bsearch(int arr[],int size,int key)
{
  int start = 0;
  int end = size-1;
  
  int mid = start +(end-start)/2;
  while(start<=end)
    {
      if(arr[mid] == key)
        return mid;
      else if(arr[mid] < key)
        start = mid + 1;
      else if(arr[mid]>key)
        end = mid - 1;
      mid = start +(end-start)/2;
    }
  return -1;
}
int main() {
  int even[6]={1,3,5,7,9,11};
  int odd[5]={2,4,6,8,10};

  int index = bsearch(even,6,5);
  cout<<"Index of 5 is : "<<index<< endl;
  
  return 0;
}
