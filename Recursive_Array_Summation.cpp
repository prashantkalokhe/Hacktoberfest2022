#include<bits/stdc++.h>
using namespace std;
int sum(int arr[],int n)
{
      int ans=0;
      if(n==0)
      {
            return 0;
      }
      if(n==1)
      {
            return arr[0];
      }
      int k={};
      return k=arr[0]+sum(arr+1,n-1);
}
int main()
{
      int arr[5]={1,2,3,4,5};
      int s=sum(arr,5);
      cout<<s;
      return 0;
}
