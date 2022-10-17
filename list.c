#include <stdio.h>
#include <stdlib.h>

int main (void){

    // Dynamically allocate an array of size 3
    int *list = malloc(3 * sizeof(int));
    if (list == NULL){
        return 1;
    }

    list[0] = 1;
    list[1] = 2;
    list[2] = 3;

    // *list = 1;
    // *(list + 1) = 2;

    // Resize old array to be of size 4
    int *tmp = realloc (list, 4 * sizeof(int));
        if (tmp == NULL){
            free(list);
            return 1;
    }

    // list[3] = 4;
    // for (int i=0; i< 3; i++){
    //     printf("%i\n", list[i]);
    // }
    // Free old array

    free(list);

    list = tmp;
    // print new array
    for (int i=0; i< 4; i++){
        printf("%i\n", list[i]);
    }
    // Free new array
    free(list);
    return 0;
}
