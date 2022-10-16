#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a,b,x,y,z,k,m;
    cin>>a>>b;
    x = a & b;
    y = a | b;
    z= a ^ b;
    k = ~a;
    m= a >> 1;
    int n = k << 2 ;
    int i;
    cin>>i;

    cout<<x<<endl;
    cout<<y<<endl;
    cout<<z<<endl;
    cout<<k<<endl;

    cout<<m<<endl;;
    cout<<n<<endl;;
    cout << (++i);
    cout <<(i++);
    cout <<(i--);
    cout <<(--i);
return 0;
}
