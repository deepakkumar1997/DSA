#include<iostream>
using namespace std;

int main(){
    // Array declaration and initialization
    int arr1[10]; // in this array elmetns are initialized with garbage values;
    int arr2[5] = {1,2,3,4,5};
    int arr3[5] = {1,2,3}; // Rest elements will be assigned with zero
    // How to initialize zero to all elements of an array
    int arr4[10] = {0};
    // Different types of initialization of an array
    arr1[0] = 1;
    1[arr1] = 2;
    2[arr1] = 3;

    //int arr5[6] = {1, [5]=6, [3]=4, [2]3}; // This gcc compiler does support this

    int arr6[] = {1,2,3,4};

    // Getting size of array

    cout<< sizeof(arr1)<<" ";
    cout<< sizeof(arr2)<<" ";
    cout<< sizeof(arr3)<<" ";
    cout<< sizeof(arr4)<<" ";
    //cout<< sizeof(arr5)<<" ";
    cout<< sizeof(arr6)<<" \n";
    
    // Accessing array elements
    for(int i=0; i<sizeof(arr1)/sizeof(arr1[0]); ++i)
        cout<<arr1[i]<<" ";
    cout<<endl;
    for(int i=0; i<sizeof(arr3)/sizeof(arr3[0]); ++i)
        cout<<arr3[i]<<" ";
    cout<<endl;
    for(int i=0; i<sizeof(arr4)/sizeof(arr4[0]); ++i)
        cout<<arr4[i]<<" ";
    return 0;
}