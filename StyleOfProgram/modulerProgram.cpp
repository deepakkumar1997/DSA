// Divide the task into multiple subtask and write it as a function and it is called
// modular programming
#include<iostream>
using namespace std;

int inputLength(){
    int length;
    cout<<"Enter length of rectangle: ";
    cin>>length;
    return length;
}

int inputBreadth(){
    int breadth;
    cout<<"Enter breadth of rectangle: ";
    cin>>breadth;
    return breadth;
}

int area(int length, int breadth){
    return length*breadth;
}

int perimeter(int length, int breadth){
    int p = 2*(length+breadth);
    return p;
}

int main(){
    // Calculating area of rectangle
    int length = inputLength();
    int breadth = inputBreadth();

    int a = area(length,breadth);
    int p = perimeter(length,breadth);

    cout<<"Area of rectangle: "<<a<<endl;
    cout<<"Perimeter of rectangle: "<<p<<endl;

    return 0;
}