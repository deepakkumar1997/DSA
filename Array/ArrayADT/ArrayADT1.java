import java.util.Scanner;

class Array{
    // Props
    int[] A;
    int size;
    int length;
    // Behaviours
    // Displaying array elements
    void Display(){
        for(int i=0; i<length; ++i){
            System.out.print(A[i]+" ");
        }
    }
    // Adding/Appending an element to the array
    void Append(int value){
        A[length] = value;
        ++length;
    }
    // Inserting an element at any index of an array
    void InsertAtIndex(int index, int value){
        if(index>length)
            System.exit(0);
        for(int i=length; i>index; --i)
            A[i] = A[i-1];
        A[index] = value;
        ++length;
    }
}

public class ArrayADT1{
    public static void main(String[] args){
        Array arr = new Array();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        arr.size = scan.nextInt();

        arr.A = new int[arr.size];
        
        System.out.print("Enter length of an array: ");
        int n = scan.nextInt();
        if(n>arr.size)
            System.exit(0);
        arr.length = n;
        // Taking input in the array
        for(int i=0; i<arr.length; ++i){
            System.out.print("Enter value at index "+i+" = ");
            arr.A[i] = scan.nextInt();
        }

        System.out.println();
        arr.Append(5);
        arr.InsertAtIndex(4,10);
        arr.Display();
    }
}