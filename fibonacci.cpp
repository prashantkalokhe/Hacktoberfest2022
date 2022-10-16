#include<iostream>
using namespace std;

int isfibbo(int num){
    int t1=0,t2=1,nexttrm;
    for(int i=1;i<=num;i++){
        cout<< t1<<endl;
        nexttrm=t1+t2;
        
        t1=t2;
        t2=nexttrm;
    }
    
}

int main()
{
     int n;
     cout<<"Enter The RAnge" ;
     cin>>n;
     isfibbo(n);
    return 0;
}
