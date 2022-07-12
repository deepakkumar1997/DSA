#include<iostream>
using namespace std;

struct Circle{
    int radius;
};

int main(){
    struct Circle c1 = {5};
    struct Circle *ptr = &c1;

    // Accessing circle through pointer
    // ptr.radius; this is wrong because first we have to derefenece the ptr
    //*ptr.radius; // This will not work as .(dot) operator has greater precedence than
    // *(asterisk) so . will get called first with ptr and here comes the problem
    // to solve this we use bracket to perform dereferencing first then call dot opra;
    cout<<(*ptr).radius<<endl;
    // so it is very lenghty so another operator is introduced to access structure
    // variables through pointer variable or data using arrow operator(->)
    cout<<ptr->radius;

    // Creating memory for circle's structure in heap memory
    struct Circle *c2;
    c2 = (struct Circle*)malloc(sizeof(struct Circle));
    c2->radius = 5;
    cout<<"\nArea of circle c2 = "<<((float)22/7)*c2->radius*c2->radius;

    // In cpp you can omit struct keyword before creating a structure var or object
    Circle *c3 = (Circle*)malloc(sizeof(Circle));
    c3->radius = 10;
    cout<<"\nDiameter of circle c3 = "<<2*c3->radius;
    // In cpp, generally we use new keyword to create memory in heap
    Circle *c4 = new Circle;
    c4->radius = 8;
    cout<<"\nPerimeter of circle c4 = "<<((float)(22/7))*c4->radius*2;

    // Deallocate or release the memory pointing to heap
    free(c2);
    free(c3);
    delete c4;
    return 0;
}