class Array{
    // Props
    public int[] A;
    public int length;
    
    // Methods
    // Displaying array elements
    public void Display(){
        for(int i=0; i<length; ++i){
            System.out.print(A[i]+" ");
        }
    }
    // Adding/Appending an element to the array
    public void Append(int value){
        A[length] = value;
        ++length;
    }
    // Inserting an element at any index of an array
    void InsertAtIndex(int index, int value){
        if(index>length || index<0)
            System.exit(0);
        for(int i=length; i>index; --i)
            A[i] = A[i-1];
        A[index] = value;
        ++length;
    }
    // Delete an element from given index
    public void DeleteAtIndex(int index){
        if(index>=length || index<0)
            System.exit(0);
        for(int i=index; i<length; ++i)
            A[i] = A[i+1];
        --length;
    }
    // Search an element in an array and basically this is linear search
    public void SearchElement(int element){
        int counter=0;
        for(int i=0; i<length; ++i){
            if(A[i]==element)
                counter++;
        }
        if(counter==0)
            System.out.println("Element not found in the array");
        else System.out.println("Element found "+counter+" time/s in the array");
    }
    
}

public class ArrayADT{
    public static void main(String[] args){
        Array arr = new Array();
        arr.A = new int[10];
        arr.length = 3;
        // Taking input in the array
        arr.A[0] = 1;
        arr.A[1] = 2;
        arr.A[2] = 3;
        System.out.println();

        arr.Append(-1);
        arr.InsertAtIndex(2,20);
        arr.DeleteAtIndex(2);
        arr.SearchElement(3);
        arr.Display();
    }
}