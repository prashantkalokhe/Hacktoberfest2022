#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	scanf("%d",&t);
	while(t--){
	    int N;
	    scanf("%d",&N);
	    if(N==1){
	        printf("%d\n",1);
	    }
	    else if(N<=3&&N>=2){
	        printf("%d\n",N-1);
	    }
	    else{
	        printf("%d\n",N);
	    }
	}
	return 0;
}
