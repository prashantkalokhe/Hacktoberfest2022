#include<iostream.h>
#include<conio.h>
void arr(int a[10],int n)
{
		int b[10][10],i,j;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
				b[i][j]=a[i];
			}
		for(i=0;i<n;i++)
		{
		  cout<<"\n";
			for(j=0;j<n;j++)
			{
				cout<<b[i][j]<<" ";
			}
		}
}
void ins(int a[10],int n)
{
	int s,i,j,r,temp;
	cout<<"enter element and location";
	cin>>s>>r;
	for(i=n;i>r;i--)
		a[i]=a[i-1];
	a[r]=s;
	for(i=0;i<=n;i++)
		cout<<a[i]<<" ";
}
void main()
{
	clrscr();
	int i,n,a[10],ch;
	char x='y';
	while(x=='y'||x=='Y')
		{
			cout<<"enter limit";
			cin>>n;
			cout<<"enter array";
			for(i=0;i<n;i++)
				cin>>a[i];
			cout<<"menu \n1 Assign to 2D array \n2 Insert an element";
			cin>>ch;
			if(ch==1)
				arr(a,n);
			else if(ch==2)
				ins(a,n);
			else
				cout<<"invalid choice";
				cout<<"\nDo you want to continue?";
				cin>>x;
		}
	getch();
}