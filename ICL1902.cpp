#include <iostream>
using namespace std;
#include<cmath>
int main() {
	// your code goes here
	int t;
	scanf("%d",&t);
	while(t--){
	    int N;
	    scanf("%d",&N);
	    int k=0;
	    int rem=1;
	    while(rem!=0){
	        int result=sqrt(N);
	        rem=N-(result*result);
	        N=rem;
	        k++;
	    }
	    cout<<k<<endl;
	}
	return 0;
}
