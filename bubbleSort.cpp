#include<iostream>
#include<vector>
using namespace std;

void bubbleSort(vector<int> &a) {
    int n = a.size();

    for(int i=0; i<n; i++) {
        for(int j=i+1; j<n; j++) {
            if(a[i] > a[j]) {
                swap(a[i], a[j]);
            }
        }
    }

}

int main() {
    
    int n;
    cin >> n;

    vector<int> a(n);
    for(int i=0; i<n; i++) {
        cin >> a[i];
    }

    bubbleSort(a);

    for(int i=0; i<n; i++) {
        cout << a[i] << ' ';
    }

}
