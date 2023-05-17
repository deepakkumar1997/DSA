// Take a number input a print till that number recursively;
#include<iostream>
using namespace std;

void numSeries(int n){
    if(n==1)
        cout<<n;
    else{
        numSeries(n-1);
        cout<<" "<<n;
    }
}
int main(int argc, char const *argv[]){
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    numSeries(n);
    return 0;
}