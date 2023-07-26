class LinearSearch{
    public int linearSearch(int element, int... arr){
        for(int i=0; i<arr.length; ++i){
            if(element==arr[i])
                return i;
        }
        return -1;
    }
    // It has TC as O(n) and int... is known as "varargs"
}
class ArrayADTLinearSearch{
    // props
    public int[] array;
    public int length;

    // Methods
    public int simpleLinearSearch(int element){
        for(int i=0; i<length; ++i){
            if(element == array[i])
                return i;
        }
        return -1;
    }
    public int linearSearchTransposition(int element){
        for(int i=0; i<length; ++i){
            if(element == array[i]){
                array[i] = array[i]+array[i-1];
                array[i-1] = array[i]-array[i-1];
                array[i] = array[i]-array[i-1];
                return i;
            }
        }
        return -1;
    }
    public int linearSearchMoveToHead(int element){
        for(int i=0; i<length; ++i){
            if(element == array[i]){
                array[i] = array[i]+array[0];
                array[0] = array[i]-array[0];
                array[i] = array[i]-array[0];
                return i;
            }
        }
        return -1;
    }
    public void DisplayArray(){
        for(int i=0; i<length; ++i){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public void SearchResult(int index){
        if(index==-1)
            System.out.println("Element is not found!");
        else System.out.println("Element found at index "+index);
    }
}

class LinearSearchNoDuplicate{
    public static void main(String [] args){
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.linearSearch(40,new int[]{1,23,4,5,6});
        if(index==-1)
            System.out.println("Element is not found!");
        else System.out.println("Element found at index "+index);

        index = linearSearch.linearSearch(6, 1,2,3,4,5,6,7,8,6);
        if(index==-1)
            System.out.println("Element is not found!");
        else System.out.println("Element found at index "+index);

        ArrayADTLinearSearch arr = new ArrayADTLinearSearch();
        arr.array = new int[10];
        arr.array[0] = 1;
        arr.array[1] = 2;
        arr.array[2] = 3;
        arr.array[3] = 4;

        arr.length = 4;

        index = arr.simpleLinearSearch(4);
        arr.SearchResult(index);
        arr.DisplayArray();

        index = arr.linearSearchTransposition(2);
        arr.SearchResult(index);
        arr.DisplayArray();

        index = arr.linearSearchMoveToHead(4);
        arr.SearchResult(index);
        arr.DisplayArray();
    }
}