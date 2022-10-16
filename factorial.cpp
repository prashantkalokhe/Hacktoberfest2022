#include<iostream>
using namespace std;

int fact(int num){
int i,total=1;
for(i=1;i<=num;i++){
     total=total*i;
   }
return total;
}

int main()
{
     int n;
     cout<<"Enter The Number To check it's Factorial"<<endl;
     cin>>n;
     int ans=fact(n);
     cout<<"The Factorial Of "<<n<<" "<<"is "<<endl;
     cout<<ans<<endl;
    return 0;
}
