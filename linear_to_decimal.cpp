#include<iostream>
using namespace std;

int binary_to_decimal(int num1){
    int ans=0;
    int x=1;
    while(num1>1){
    int y=num1%10;
    ans+=x*y;
    x*=2;
    num1/=10;
    }return ans;
}
int main()
{
     int n;
     cout<<"Enter a Binary number to convert to decimal"<<endl;
     cin>>n;
     int r=binary_to_decimal(n);
     cout<<"The Value Is "<<r<<endl;

    return 0;
}
