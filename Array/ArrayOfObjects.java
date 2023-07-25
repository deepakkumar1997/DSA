class Student{
    int rollNo;
    String name;
    int marks;
}

class ArrayOfObjects{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Deepak";
        s1.marks = 81;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Nikhil";
        s2.marks = 62;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Shubham";
        s3.marks = 93;

        // To get rid of this we can create array of ADT
        Student[] students = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        students[3] = new Student();
        students[3].rollNo = 4;
        students[3].name = "Sahil";
        students[3].marks = 91;

        for(Student s : students){
            System.out.println(s.name+" : "+s.marks);
        }
    }
}