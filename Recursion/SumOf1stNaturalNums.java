public class SumOf1stNaturalNums{
    // Sum of first n natural numbers using recursion (TC=O(n), SC=O(n))
    public static int sum(int n){
        if(n==0)
            return 0;
        else return sum(n-1)+n;
    }
    // Sum of first n natural numbers using loop (TC=O(n), SC=O(1))
    public static int sumLoop(int n){
        int sum=0;
        for(int i=1; i<=n; ++i){ // TC(n+1)
            sum+=i;
        }
        return sum;
    }
    // Sum of first n natural numbers using mathematich formula( TC=O(1), SC=O(1) )
    public static int sumOfNNatNum(int n){
        return (n*(n+1))/2;
    }
    // We should use sumOfNNatNum(int n) method to calculate sum of 1st n natural numbers as it is taking 
    // constant Time Complexity and Space Complexity;
    public static void main(String []args){
        int n = 100;
        System.out.println("Sum of first "+n+" natural numbers: "+sum(n));
        System.out.println("Sum of first "+n+" natural numbers: "+sumLoop(n));
        System.out.println("Sum of first "+n+" natural numbers: "+sumOfNNatNum(n));
    }
}