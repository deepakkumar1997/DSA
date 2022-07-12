#include<iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    // Declaration of variable
    int num = 10; // Data variable
    int *ptr; // Address variable
    // Initialization
    ptr = &num;
    // Dereferencing 
    cout<<*ptr<<endl;
    // Declaration and Initialization in same line
    int *ptr1 = &num;
    // Dereferencing
    cout<<*ptr1;
    return 0;
}
