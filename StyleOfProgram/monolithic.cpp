// Writing everything in main function is monolithic style of program
#include<iostream>
using namespace std;

int main(){
    // Calculating area of rectangle
    int length = 0;
    int breadth = 0;

    cout<<"Enter length of rectangle: ";
    cin>>length;
    cout<<"Enter breadth of rectangle: ";
    cin>>breadth;

    int area = length*breadth;
    int perimeter = 2*(length+breadth);

    cout<<"Area of rectangle: "<<area<<endl;
    cout<<"Perimeter of rectangle: "<<perimeter<<endl;

    return 0;
}