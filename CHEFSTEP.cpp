#include <iostream>
using namespace std;

int main() {
    //your code goes here
    int t;
    scanf("%d",&t);
    while(t--){
        int N,K;
        scanf("%d%d",&N,&K);
        int D[N];
        for(int i=0;i<N;i++){
            scanf("%d",&D[i]);
        }
        for(int i=0;i<N;i++){
            if(D[i]%K==0){
                printf("%d",1);
            }
            else{
                printf("%d",0);
            }
        }
        printf("\n");
    }
	return 0;
}
