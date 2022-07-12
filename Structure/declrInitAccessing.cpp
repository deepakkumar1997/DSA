#include<iostream>
using namespace std;

// Structure definition
struct Rectangle{
    int length;
    int breadth;
    char x;
}r1;// One type of declarion of structure variable and its global
// Definition does not contain any memory until you declare a variable for this.

// Another global variable of structure
struct Rectangle r2;

int main(){
    // Local structure variable inside main function
    struct Rectangle r3;
    // Declaration and initialization in same line
    struct Rectangle r4={12,5};
    // Initialization of structure
    r1.length = 20;
    r1.breadth = 5;
    // Assigning structure var to another var
    r3 = r1;
    r2 = {r2.breadth=10,r2.length=4};
    
    // Accessing structures
    cout<<"Area of Rectangle r1: "<<r1.length*r1.breadth<<endl;
    cout<<"Area of Rectangle r2: "<<r2.length*r2.breadth<<endl;
    cout<<"Area of Rectangle r3: "<<r3.length*r3.breadth<<endl;
    cout<<"Area of Rectangle r4: "<<r4.length*r4.breadth<<endl;
    // Getting size of structure
    cout<<sizeof(r1)<<endl;// output: 8 that is two int's 4+4
    // Now add another variable in structure and find its size
    cout<<sizeof(r2)<<endl;// Now you can see the size is 12 but char takes only 1 byte
    // So why for char it taken 4 byres, So it due to padding in memory so for 
    // memory it is easy to assign 4 bytes of memory to the operations that's why 4
    // otherwise it will use only 1 byte rest 3 byte will be discarded;
    // and this adjustment in memory is called  padding;
    return 0;
}