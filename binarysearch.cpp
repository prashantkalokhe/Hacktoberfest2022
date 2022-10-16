#include <iostream>
using namespace std;
int check,i;
int binary_search(int arr[], int size, int element)
{
    int low = 0, mid, high = (size - 1);

    while (low <= high)
    {
        mid = (low + high) / 2;
        if (arr[mid] == element)
        {
            return mid;
        }
        if (arr[mid] < element)
        {
            low = mid + i;
        }
        else
        {
            high = mid - i;
        }
    }
    check = 0;
}
int main()
{
    int size, i, j, element;
    cout << "Enter Size Of The Array" << endl;
    cin >> size;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cout << "Enter"
             << " " << i + 1 << " "
             << "element" << endl;
        cin >> arr[i];
    }
    for (i = 0; i < size; i++)
    {
        for (j = i + 1; j < size; j++)
        {
            if (arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    cout << "after The Sorting The Arry is" << endl;
    for (i = 0; i < size; i++)
    {
        // cout<<i+1<<" "<<"element"<<endl;
        cout<< arr[i] << " " << endl;
    }

    cout << "Enter A Number From The Sorted Array" << endl;
    cin >> element;
   int index=binary_search(arr, size, element);
   cout<<"The Search element is Found at Index No "<<index;
    return 0;
}
