#include <iostream>
using namespace std;

int main() {
    //your code goes here
    int t;
    scanf("%d",&t);
    while(t--){
        int N,A,B;
        scanf("%d%d%d",&N,&A,&B);
        string s;
        cin>>s;
        int i=0,result=0;
        while(s[i]!='\0'){
            if(s[i]=='1'){
                result=result+B;
            }
            else if(s[i]=='0'){
                result=result+A;
            }
            i++;
        }
        cout<<result<<endl;
    }
	return 0;
}
