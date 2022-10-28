#include<conio.h>
#include<iostream.h>
void sum(int A[10][10] ,int N )
{
int i,j,sum=0;
for(i=0;i<N;i++)
  for(j=0;j<N;j++)
  {
   if(i>j||j>i)
   sum+=A[i][j];
  }
 cout<<"sum="<<sum;
}
void prod(int A[10][10], int N )
{
int i,j,pro=1;
for(i=0;i<N;i++)
 for(j=0;j<N;j++)
  {
   if(i==j||i+j==N-1)
    pro*=A[i][j];
  }
cout<<"\nproduct="<<pro;
}
void trans(int A[10][10] ,int N)
{
int i,j,b[10][10];
for(i=0;i<N;i++)
 for(j=0;j<N;j++)
  {
   b[i][j]=A[j][i];
  }
for(i=0;i<N;i++)
 {
 cout<<"\n";
 for(j=0;j<N;j++)
  cout<<b[i][j]<<" ";
 }
}
void main()
{
clrscr();
int ch,i,j,N,A[10][10];
char y;
while(y=='y'||y=='Y')
{
cout<<"\nEnter N";
cin>>N;
for(i=0;i<N;i++)
 for(j=0;j<N;j++)
  {
   cout<<"enter element";
   cin>>A[i][j];
  }
cout<<"Menu \n1 Sum of upper and lower diagonal elements \n2 Product of diagonal elements\n3 transpose and display ";
 cin>>ch;
if(ch==1)
 sum(A,N);
else if(ch==2)
 prod(A,N);
else if(ch==3)
 trans(A,N);
else
 cout<<"invalid choice";
cout<<"\nDo you want to continue?";
cin>>y;
}
getch();
}