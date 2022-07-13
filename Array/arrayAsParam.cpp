// Take an array and paas it as parameter and change some value and print again
#include<iostream>
using namespace std;

void arrayAsParam(int arr[], int n){
    // cout<<sizeof(arr)/sizeof(arr[0])<<endl; 
    // Above line of code will try to calculate size of array but it is a pointer so
    // it will print size of pointer i.e. is 8 and div by 4 i.e. 2
    for(int i=0; i<n; ++i)
        cout<<arr[i]<<" ";

    // Modifying array values
    arr[0] = 22;
    arr[3] = 8;
    // No need to return the array as it is working on addresses so array name
    // itself is a pointer which points to first block of an array
}
void arrayAsParam2(int *arr, int n){
    arr[1] = 20;
}

int main(){
    int arr[] = {1,2,3,4,5};
    int n = sizeof(arr)/sizeof(arr[0]);
    arrayAsParam(arr,n);
    cout<<endl;
    arrayAsParam2(arr,n);
    for(int i=0; i<n; ++i)
        cout<<arr[i]<<" ";
    return 0;
}