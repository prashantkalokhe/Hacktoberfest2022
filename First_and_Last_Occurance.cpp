#include <iostream>
using namespace std;
int first_occurance(int arr[], int n, int k) {
  int start = 0;
  int end = n - 1;
  int mid = start + (end - start) / 2;
  int ans = -1;
  while (start <= end) {
    if (arr[mid] == k) {
      ans = mid;
      end = mid - 1;
    } else if (arr[mid] < k) {
      start = mid + 1;
    } else if (arr[mid] > k) {
      end = mid - 1;
    }
    mid = start + (end - start) / 2;
  }
  return ans;
}
int last_occurance(int arr[],int n,int k)
{
  int start = 0;
  int end = n - 1;
  int mid = start + (end - start)/2;
  int ans=-1;
  while(start<=end)
    {
      if(arr[mid]==k)
      {
        ans=mid;
        start=mid+1;
      }
      else if(arr[mid]<k)
      {
        start=mid+1;
      }
      else if(arr[mid]>k)
      {
        end=mid-1;
      }
      mid=start + (end - start)/2;
    }
  return ans;
}
int main() {
  int arr[8] = {1, 1, 1, 2, 2, 2, 6, 6};
  int left = first_occurance(arr, 6, 2);
  int right = last_occurance(arr, 6, 2);
  cout << "First occurance of element 2 is : " << left << endl;
  cout << "Last occurance of element 2 is : " << right << endl;
  return 0;
}
