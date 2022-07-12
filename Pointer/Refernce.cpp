// Reference is name given to the variable or alias given to a variable;
#include<iostream>
using namespace std;

int main(){
    // Reference vaiable must be initialized at time of declaration otherwise it 
    // give error that 'var' declared as refernce but not initialized; 
    // and if a ref var is assigned for an var then it can't be updated;
    // like if int number; int &n = number; int num2; &n = num2, it is wrong
    int number = 10; // Normal var
    int &n = number; // so n is another name of number or alias
    // and also n is reference to the var number now any operation on n will affect 
    // number as both are pointing to same address
    cout<<number<<" "<<n<<endl;
    n++;
    cout<<number<<" "<<n<<endl;
    // So why we use reference variable 
    // So we use reference variable for parameters passing
    // Refernce is nothing but another name given to a variable
}