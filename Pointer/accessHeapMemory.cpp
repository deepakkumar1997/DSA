// So allocate memory in heap using malloc and new keyword and access using pointer
#include<iostream>
using namespace std;

int main(){
    // creating a pointer or address variable;
    int *ptr1;
    // Creating memory in heap using malloc function and assigning it to a pointer
    ptr1 = (int*)malloc(5*sizeof(int));
    // so usng malloc(5*sizeof(int)); will create a 5 size of integer array in heap
    // memory and
    // Now malloc function returns void type pointer so we have to typecast 
    // Then I'm assigning the address of first block of newly created memory in heap
    // to pointer ptr1;

    // Creating a pointer variable and also creating memory in heap using new keyword
    // and assigning it to pointer
    int *ptr2 = new int[5];

    for(int i=0; i<5; ++i){
        cin>>ptr1[i];
        ptr2[i] = ptr1[i];
    }

    for(int i=0; i<5; ++i)
        cout<<ptr1[i]<<" "<<ptr2[i]<<endl;

    double Arr[4] = {1.004, 4.,34.34,45};
    double *ptr3;
    ptr3 = Arr; // no need to use & (address of) operator as array name itself points
    // to first block of memory;
    for(int i=0; i<4; ++i)
        cout<<ptr3[i]<<" ";

    // Deallocating the memory after using it
    // In c we use free function
    free(ptr1);
    // In cpp we use delete keyword
    delete []ptr2;
    return 0;
}