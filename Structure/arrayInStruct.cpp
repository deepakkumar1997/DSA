// Create a structure with array inside it and then pass it to the function
#include<iostream>
using namespace std;

struct Student{
    int roll;
    int marks[5];
};
// pass by value
void displayStudentInfo(Student s){
    cout<<"Roll no of student: "<<s.roll<<endl;
    cout<<"Marks of student: ";
    //cout<<sizeof(s.marks);
    for(int i=0; i<sizeof(s.marks)/sizeof(s.marks[0]); ++i)
        cout<<s.marks[i]<<" ";
    cout<<endl;
}
// Pass by reference
void changeStudentMarks(Student &s){
    s.marks[0] = 95;
}
// Pass by address
void changeStudentMarksByAddress(Student *s){
    s->marks[1] = 88;
}

int main(){
    Student s1 = {9,{81,83,76,91,87}};
    displayStudentInfo(s1);
    changeStudentMarks(s1);
    changeStudentMarksByAddress(&s1);
    displayStudentInfo(s1);
    return 0;
}