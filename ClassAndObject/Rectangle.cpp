#include<iostream>
using namespace std;

class Rectangle{
    private:
        int length;
        int breadth;
    
    public:
        // Parameterized constructor
        Rectangle(int length, int breadth){
            this->length = length;
            this->breadth = breadth;
        }
        // Constructor is used for initialize or create an object;
        int area(){
            return length*breadth;
        }
        void updateLength(int len){
            length = len;
        }
        void updateBredth(int b){
            this->breadth = b;
        }
};

int main(){
    // create an object of Rectangle class
    Rectangle r1(10,5); // creating object and initializing its data members
    cout<<"Area of rectangle r1: "<<r1.area()<<endl;
    r1.updateLength(20);
    r1.updateBredth(7);
    cout<<"Updated area of rectangle r1: "<<r1.area()<<endl;

    return 0;
}