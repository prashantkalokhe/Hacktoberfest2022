#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	scanf("%d",&t);
	while(t--){
	    long long N,B,M,total=0,prb=0;
	    scanf("%ld%ld%ld",&N,&B,&M);
	    while(N!=0){
	        if(N==0){
	            break;
	        }
	        if(N%2!=0){
	            prb=(N+1)/2;
	            total=total+(prb*M);
	            N=N-prb;
	            M=M*2;
	            if(N!=0)
	            total=total+B;
	        }
	        if(N==0){
	            break;
	        }
	        if(N%2==0){
	            prb=(N)/2;
	            total=total+(prb*M);
	            N=N-prb;
	            M=M*2;
	            if(N!=0)
	            total=total+B;
	        }
	        if(N==0){
	            break;
	        }
	        //M=M*2;
	    }
	    cout<<total<<endl;
	}
	return 0;
}
