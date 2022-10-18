//CHECK PRIME NUMBER
#include <stdio.h>
#include <math.h>
int count=0;
int main()
{
    int i,flag=0,n;
    printf("Enter number:"); 
    scanf("%d",&n);
     if (n == 0 || n == 1)
     {
        count++;
        printf("Not prime");
    }
        else {
    for(i=2;i<=(int)sqrt(n);i++) 
    { count++;
        if(n%i==0) 
        {
            flag=1; count++;
            break; 
        }
    }
    if(flag==0){ count++;
        printf("Prime");
        }
    else{ count++;
        printf("Not Prime");
    }
    }
    printf("\nCount is %d",count+1);
return 0;
}
