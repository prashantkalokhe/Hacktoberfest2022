#include <stdio.h>
#include <time.h>
void main()
{
    double total_time;
    clock_t start, end;
    int capacity, no_items, cur_weight, item;
    int used[10];
    float total_profit;
    int i;
    int weight[10];
    int profit[10];

    printf("Enter the capacity of knapsack:\n");
    scanf("%d", &capacity);

    printf("Enter the number of items:\n");
    scanf("%d", &no_items);

    printf("Enter the weight and profit of %d item:\n", no_items);
    for (i = 0; i < no_items; i++)
    {
        printf("Weight[%d]:\t", i);
        scanf("%d", &weight[i]);
        printf("Profit[%d]:\t", i);
        scanf("%d", &profit[i]);
    }

    for (i = 0; i < no_items; ++i)
        used[i] = 0;

    cur_weight = capacity;
    while (cur_weight > 0)
    {
        item = -1;
        for (i = 0; i < no_items; ++i)
            if ((used[i] == 0) &&
                ((item == -1) || ((float) profit[i] / weight[i] > (float) profit[item] / weight[item])))
                item = i;

        used[item] = 1;
        cur_weight -= weight[item];
        total_profit += profit[item];
        if (cur_weight >= 0)
            printf("Added object %d (%d Rs., %dKg) completely in the bag. Space left: %d.\n", item + 1, profit[item], weight[item], cur_weight);
        else
        {
            int item_percent = (int) ((1 + (float) cur_weight / weight[item]) * 100);
            printf("Added %d%% (%d Rs., %dKg) of object %d in the bag.\n", item_percent, profit[item], weight[item], item + 1);
            total_profit -= profit[item];
            total_profit += (1 + (float)cur_weight / weight[item]) * profit[item];
        }
    }

    printf("Filled the bag with objects worth %.2f Rs.\n", total_profit);
    end = clock();
    total_time = ((double) (end - start)) / CLK_TCK;
    printf("\nTime taken : %f seconds\n", total_time);
    ;
}
