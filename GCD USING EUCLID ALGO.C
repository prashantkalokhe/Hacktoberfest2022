#include<stdio.h>
#include<math.h>
#include<time.h>


int gcd(int x,int y){
	int c=y%x;
	if(c==0){
		return x;
	}
	else{
		y=x;
		x=c;
		return gcd(x,y);
	}
}
int main(){

	int a,b;
	printf("\nENTER THE TWO NUMBERS A AND B\n");
	scanf("%d%d",&a,&b);
	if(a>b){
		printf("GCD IS %d",gcd(b,a));
	}
	else{
		printf("GCD IS %d",gcd(a,b));
	}
}
