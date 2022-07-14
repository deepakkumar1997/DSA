// Create a structure of student and pass it as parameter(as value, reference , address)
#include<iostream>
using namespace std;

struct Student{
    int rollNo;
    string name;
};
// Pass by value
Student changeRollNo(Student s, int roll){
    s.rollNo = roll;
    return s;
}

// Pass by reference 
void changeName(Student &s, string name){
    s.name = name;
}

// Pass by address
void changeRollNoAndName(Student *s, int roll, string name){
    s->name = name;
    s->rollNo = roll;
}

// Creating a new student in heap memory
Student* createStudent(int roll, string name){
    Student *s = new Student;
    // in c-lang we can use malloc function to do that
    // Student *s = (Student*)malloc(sizeof(Student));
    s->name = name;
    s->rollNo = roll;
    return s;
}

int main(){
    Student s1 = {1,"Deepak"};
    s1 = changeRollNo(s1,9);
    cout<<"Roll number of "<<s1.name<<" is "<<s1.rollNo<<endl;
    
    Student s2 = {12, "Ghanshyam"};
    changeName(s2,"Ghanshyam Jha");
    cout<<"Roll number of "<<s2.name<<" is "<<s2.rollNo<<endl;

    Student s3 = {17, "JP"};
    changeRollNoAndName(&s3, 46, "Rishav Kashyap");
    cout<<"Roll number of "<<s3.name<<" is "<<s3.rollNo<<endl;

    Student *s4 = createStudent(52, "Shubham Agarwal");
    cout<<"Roll number of "<<s4->name<<" is "<<s4->rollNo<<endl;

    return 0;
}