// Take a sorted array and insert an element like array must be in sorted order
// Insert an element in a sorted array such that resulting array remains sorted
class InsertionInSortedArray{
    public boolean isSorted(int[] arr){
        for(int i=0; i<arr.length-1; ++i){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

    public int[] insertInSortedArray(int[] arr, int value){
        // As we know that java array is immutable so we can't change the array structure then we've create a 
        // new array with +1 size of current array
        int[] newArr = new int[arr.length+1];
        // Copy element of the old one to the new one
        for(int i=0; i<arr.length; ++i)
            newArr[i] = arr[i];
        // inserting new value as array must be in sorted order
        int i = arr.length-1;
        while(i != -1 && newArr[i] > value){ 
            newArr[i+1] = newArr[i];
            --i;
        }// if someone enters minimum value then at one time index will become -1 which will throw 
        // indexOutOfBound exception so we must check that index should not go below zero
        newArr[i+1] = value;
        return newArr;
    }
}

class InsertInSortedArray{
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i=0; i<10; ++i)
            arr[i] = i+1;
        InsertionInSortedArray ins = new InsertionInSortedArray();
        if(ins.isSorted(arr)){
            int[] newArr = ins.insertInSortedArray(arr, 11);
            for(int element: newArr)
                System.out.print(element+" ");
            System.out.println();
        }
    }
}