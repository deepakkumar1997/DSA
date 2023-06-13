import java.util.Scanner;

class FibonacciSeries{
    protected int fibonacciSeries(int n){
        if(n<=1)
            return n;
        return fibonacciSeries(n-2)+fibonacciSeries(n-1);
    }
}

class FibonacciWithMemoization{
    protected int fibonacciWithMemoization(int n){
        int[] arr = new int[50];
        if(n<=1){
            arr[n] = n;
            return n;
        }
        else{
            if(arr[n-2]==0)
                arr[n-2] = fibonacciWithMemoization(n-2);
            if(arr[n-1]==0)
                arr[n-1] = fibonacciWithMemoization(n-1);
            arr[n] = arr[n-2]+arr[n-1];
            return arr[n-2]+arr[n-1];
        }
    }
}

class FibonacciLoop{
    int fibonacciLoop(int n){
        int t0=0, t1=1, s=0;
        if(n<=1)
            return n;
        for(int i=2; i<=n; ++i){
            s = t0+t1;
            t0 = t1;
            t1 = s;
        }
        return s;
    }
}

public class Fibonacci{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        FibonacciSeries fs = new FibonacciSeries();
        FibonacciWithMemoization fm = new FibonacciWithMemoization();
        FibonacciLoop fl = new FibonacciLoop();
        System.out.println("For the value of n= "+n+", the value of Fibonacci number is "+fs.fibonacciSeries(n));
        System.out.println("For the value of n= "+n+", the value of Fibonacci number is "+fl.fibonacciLoop(n));
        System.out.println("For the value of n= "+n+", the value of Fibonacci number(Memo) is "+fm.fibonacciWithMemoization(n));
    }
}