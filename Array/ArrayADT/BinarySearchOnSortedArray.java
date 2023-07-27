class BinarySearch{
    public int[] arr;
    public int length;

    public int binarySearchIterative(int l, int h, int key){
        while(l <= h){
            int mid = (l+h)/2;

            if(key == arr[mid])
                return mid;
            else if(key < arr[mid])
                h = mid-1;
            else l = mid+1;
        }
        return -1;
    }
    public int binarySearchRecursive(int l, int h, int key){
        if(l <= h){
            int mid = (l+h)/2;
            if(key == arr[mid])
                return mid;
            else if(key < arr[mid])
                return binarySearchRecursive(l, mid-1, key);
            else return binarySearchRecursive(mid+1, h, key);
        }
        return -1;
    }
    public void displayArray(){
        for(int i=0; i<length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void searchResult(int index){
        if(index==-1)
            System.out.println("Element is not found!");
        else System.out.println("Element found at index "+index);
    }
}

public class BinarySearchOnSortedArray{

    public static int binarySearchIterative(int[] arr, int element){
        int l = 0;
        int h = arr.length;
        while(l <= h){
            int mid = (l+h)/2;
            if(element == arr[mid])
                return mid;
            else if(element < arr[mid])
                h = mid-1;
            else l = mid+1;
        }
        return -1;
    }

    public static void main(String[] args){
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.arr = new int[20];
        binarySearch.arr[0] = 1;
        binarySearch.arr[1] = 3;
        binarySearch.arr[2] = 7;
        binarySearch.arr[3] = 11;
        binarySearch.arr[4] = 16;
        binarySearch.arr[5] = 19;
        binarySearch.arr[6] = 26;
        binarySearch.arr[7] = 60;
        binarySearch.length = 8;

        int index = binarySearch.binarySearchIterative(0, 8, 16);
        binarySearch.searchResult(index);
        binarySearch.displayArray();

        index = binarySearch.binarySearchRecursive(0,8,26);
        binarySearch.searchResult(index);
        binarySearch.displayArray();

        int[] array = new int[]{1,2,3,4,5,6,7,8,9};

        index = binarySearchIterative(array, 6);
        binarySearch.searchResult(index);
    }
}