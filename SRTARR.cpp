#include<iostream>
using namespace std;
void swap(char *a, char *b){
    char temp=*a;
    *a=*b;
    *b=temp;
}
int main() {
    //your code goes here
    int t;
    scanf("%d",&t);
    while(t--){
        int N,i=0;
        scanf("%d",&N);
        string S;
        cin>>S;
        int count=0;
        while(i<N){
            if(S[i]=='1'&&S[i+1]=='0'){
                count++;
            }
            i++;
        }
        cout<<count<<endl;
               
    }
	return 0;
}
