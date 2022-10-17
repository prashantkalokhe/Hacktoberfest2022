#include <iostream>
using namespace std;
#include <algorithm>
int main() {
    //your code goes here
    int N1,N2,N3,k=0,h=0;
    scanf("%d%d%d",&N1,&N2,&N3);
    int size=N1+N2+N3;
    int A[size];
    int max=A[0];
    for(int i=0;i<N1+N2+N3;i++){
        scanf("%d",&A[i]);
        if(max<A[i]){
            max=A[i];
        }
    }
    sort(A,A+size);
   int count[max]={0},flag=0;
    for(int i=0;i<size;i++){
        int result=A[i]%max;
        count[result]=count[result]+1;
        
    }
    for(int i=0;i<max;i++){
        if(count[i]>1){
            //printf("%d\n",i);
            flag++;
        }
    }
     printf("%d\n",flag);
     for(int i=0;i<max;i++){
         if(count[i]>1){
             printf("%d\n",i);
         }
     }
	return 0;
}
