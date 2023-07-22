class ArrayInitNdDecl{
    public static void main(String[] args){
        // Normal variable
        int num = 10;
        // Need of array
        int num1 = 1;
        int num2 = 8;
        int num3 = 17;
        int num4 = 5;
        // if we want so many data of same type then we can use array for better maintainance of code
        int[] arrNumStatic = {1,8,17,5}; // It is an static array and it will get its memory in the stack;
        int[] arrNumDyanamic = new int[4]; // This is an dyanamic array which will get memory in the heap;
        // Initializing data to a dynamic array
        arrNumDyanamic[0] = 1;
        arrNumDyanamic[1] = 8;
        arrNumDyanamic[2] = 17;
        arrNumDyanamic[3] = 5;
        // or we can use for loop to assign the data into the array
        for(int i=0; i<arrNumDyanamic.length; ++i){
            arrNumDyanamic[i] = i+10;
        }
        for(int elements : arrNumDyanamic ){
            System.out.println(elements+" ");
        }
    }
}