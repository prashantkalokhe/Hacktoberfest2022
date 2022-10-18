#include<stdio.h>
#include<stdlib.h>


int n;
int i,j;

struct Activity
{
    int index;
    int start;
    int finish;
};


//struct Activity* a[25];


/* void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
  }*/


void input(struct Activity* a)
{
    
    //printf("Enter the no of activities : \n");
    //scanf("%d",&n);

    for(i=0;i<n;i++)
    {
       // printf("Enter the index of the activity : ");
       // scanf("%d",&(a+i)->index);

       (a+i)->index = (i+1);
        
        printf("Enter the start time of the activity %d : ",(a+i)->index);
        scanf("%d",&(a+i)->start);
        printf("Enter the finish time of the activity %d : ",(a+i)->index);
        scanf("%d",&(a+i)->finish);
    }
}
void output(struct Activity* a)
{
    // struct Activity* a[25];
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if((a+i)->finish > (a+j)->finish)
            {
                //swap(&a[i]->finish,&a[j]->finish);
                int t = (a+i)->finish;
                (a+i)->finish=(a+j)->finish;
                (a+j)->finish=t;

                t=(a+i)->start;
                (a+i)->start=(a+j)->finish;
                (a+j)->finish=t;

                t=(a+i)->index;
                (a+i)->index=(a+j)->index;
                (a+j)->start=t;

                //swap(&a[i]->start , a[j]->start);
            }
        }
    }
    printf("Activity No. \t Start_Time\t finish_Time \n");
    for(i=0;i<n;i++)
    {
        printf("%d\t%d\t%d\n",(a+i)->index,(a+i)->start,(a+i)->finish);
    }
    int l,m;
 
    printf("Following activities are selected\n");
 
   
    l = 0;
    printf("%d ", (l+1));
   
    for (m = 1; m < n; m++) {
        
        if ( (a+m)->start >=  (a+l)->finish) {
            printf("%d ", (m+1) );
            l = m;
        }
    }
}

int main()
{

     printf("Enter the no of activities : \n");
    scanf("%d",&n);

    struct Activity* a = (struct Activity*)malloc(n*sizeof(struct Activity));
    
    input(a);
    output(a);

    return 0;
}

