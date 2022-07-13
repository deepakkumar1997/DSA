// create a function and pass size of an array and insert elements in array and 
// return the array
#include<iostream>
using namespace std;

int* createArray(int n){
    int *arr = new int[n];
    for(int i=0; i<n; ++i)
        arr[i] = i+1;
    return arr;
}

int main(){
    int n;
    cout<<"Enter size of array: ";
    cin>>n;
    int *arr = createArray(n);
    for(int i=0; i<n; ++i)
        cout<<arr[i]<<" ";
    return 0;
}