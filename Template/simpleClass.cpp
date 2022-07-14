#include<iostream>

class Arithametic{
    private:
        int num1;
        int num2;

    public:
        // Parameterized Constructor
        Arithametic(int num1, int num2);
        // Default constructor
        Arithametic();
        int add();
        int sub();
};

Arithametic::Arithametic(int num1, int num2){
        this->num1 = num1;
        this->num2 = num2;
}
Arithametic::Arithametic(){
        this->num1 = 0;
        this->num2 = 0;
}
int Arithametic::add(){
    return num1+num2;
}
int Arithametic::sub(){
    return num1-num2;
}

int main(){
    Arithametic obj1(20,10);
    std::cout<<obj1.add()<<std::endl;
    std::cout<<obj1.sub();

    return 0;
}