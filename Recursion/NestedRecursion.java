public class NestedRecursion{
    public static int fun(int n){
        if(n>100)
            return n-10;
        return fun(fun(n+11));
    }

    public static void main(String []args){
        System.out.print(" "+fun(95));
    }
}