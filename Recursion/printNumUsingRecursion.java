public class printNumUsingRecursion{
    
    public static void printNum(int n){
        if(n>0){
            System.out.print(n+" ");
            printNum(n-1);
        }
    }
    public static void printNum1(int n){
        if(n>0){
            printNum1(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        int x=5;
        printNum(x);
        System.out.println();
        printNum1(x);
    }
}