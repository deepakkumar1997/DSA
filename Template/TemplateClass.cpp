#include<iostream>
using namespace std;

template <class T>
class Arithametic{
    private:
        T num1;
        T num2;

    public:
        // Parameterized Constructor
        Arithametic(T num1, T num2);
        // Default constructor
        Arithametic();
        T add();
        T sub();
};
template <class T>
Arithametic<T>::Arithametic(T num1, T num2){
        this->num1 = num1;
        this->num2 = num2;
}
template<class T>
Arithametic<T>::Arithametic(){
        this->num1 = 0;
        this->num2 = 0;
}
template<class T>
T Arithametic<T>::add(){
    return num1+num2;
}
template<class T>
T Arithametic<T>::sub(){
    return num1-num2;
}

int main(){
    Arithametic<int> obj1(20,10);
    std::cout<<obj1.add()<<std::endl;
    std::cout<<obj1.sub()<<endl;

    Arithametic<float> obj2(3.75,2.5);
    cout<<obj2.add()<<endl;
    cout<<obj2.sub()<<endl;
    // String concatenation using + operator
    Arithametic<string> obj3("Deepak", "Pandey");
    cout<<obj3.add()<<endl;

    return 0;
}