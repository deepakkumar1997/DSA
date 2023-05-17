// take a number input from user and print till 1 using recursion
#include<iostream>
using namespace std;

void numSeries(int n){
    if(n==1)
        cout<<n;
    else{
        cout<<n<<" ";
        numSeries(n-1);
    }
}
int main(int argc, char const *argv[])
{
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    numSeries(n);
    return 0;
}
