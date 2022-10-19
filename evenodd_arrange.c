/*Write a program to input elements into an array ,
 and rearrange the array such that, all even numbers are followed by all odd numbers*/

 #include<stdio.h>
 #include<stdlib.h>

 int* arr;
 int* arr1;
 int n;

 void input()
 {
    printf("Enter size of array : ");
    scanf("%d",&n);

    arr=(int*)malloc(n*sizeof(int));
    arr1=(int*)malloc(n*sizeof(int));

    printf("Enter %d numbers : \n",n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
        arr1[i]=arr[i];
    }
 }

 void display(int* a,int n)
 {
    printf("ARRAY ELEMENETS : \n");
    for(int i=0;i<n;i++)
    printf("%d  ",a[i]);

    printf("\n");
 }

//Algorithm 1 :-
 void rearrange1()
 {
    int i,count=0;

    for(i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        {
            //swap arr[count] and arr[i]
            int t=arr[count];
            arr[count]=arr[i];
            arr[i]=t;
            count++;
        }
    }

 }

//Algorithm 2 :-
 void rearrange2(int* a,int n)
 {
    int i,j;

    for(i=0;i<n;i++)
    {
        if(a[i]%2!=0)// a[i] is odd
        {
            for(j=i+1;j<n;j++)
            {
                if(a[j]%2==0)
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;

                    //break;
                }
            }
        }
    }
 }

 int main()
 {
    input();

    printf("USING ALGORITHM 1 :- \n");
    printf("Before changing : \n");
    display(arr,n);

    rearrange1();


    printf("After changing : \n");
    display(arr,n);


    printf("USING ALGORITHM 2 :- \n");
    printf("Before changing : \n");
    display(arr1,n);

    rearrange2(arr1,n);


    printf("After changing : \n");
    display(arr,n);

    return 0;
 }
