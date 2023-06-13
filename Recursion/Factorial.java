public class Factorial{
    // Factorial using recursion( TC=O(n), SC=O(n) )
    public static int factoRecur(int n){
        if(n==0)
            return 1;
        else if(n<0){
            return -1;
        }
        else return factoRecur(n-1)*n;
    }
    // Factorial using loop (TC=O(n), SC=O(n))
    public static int factLoop(int n){
        if(n<0) return -1;
        int fact=1;
        for(int i=1; i<=n; ++i){
            fact*=i;
        }
        return fact;
    }

    public static void main(String []args){
        int num = 5;
        System.out.println("Factorial of "+num+" is "+factoRecur(num));
        System.out.println("Factorial of "+num+" is "+factLoop(num));
    }
}