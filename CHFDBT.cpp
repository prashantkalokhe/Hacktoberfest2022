#include <iostream>
using namespace std;

int main() {
    //your code goes here
    int t;
    scanf("%d",&t);
    while(t--){
        int N;
        scanf("%d",&N);
        int count=N;
        if(N%2==0){
            count=N/2;
        }
        else{
            count=(N/2)+1;
        }
        cout<<count<<endl;
    }
	return 0;
}
