import java.util.Scanner;

class Factorial{
    int fact(int n){
        if(n==0)
            return 1;
        return fact(n-1)*n;
    }
}

class NcrUsingFact{
    Factorial f = new Factorial();
    int nCr(int n, int r){
        int num=0, den=0;
        num = f.fact(n);
        den = f.fact(r)*f.fact(n-r);

        return num/den;
    }
}

class NcrRecursion{
    int nCr(int n, int r){
        if(r==0||r==n)
            return 1;
        return nCr(n-1,r-1)+nCr(n-1,r);
    }
}

public class Combination{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("***********Enter values for combination***************");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        System.out.print("Enter value of r(<=n): ");
        int r = scan.nextInt();
        if(r>n){
            System.out.println("Value of r sholud be less than or equal to n");
            System.exit(0);
        }
        NcrUsingFact ncr = new NcrUsingFact();
        NcrRecursion nc = new NcrRecursion();
        System.out.println("The value of "+n+" C "+r+" is "+ncr.nCr(n, r));
        System.out.println("The value of "+n+" C "+r+" is "+nc.nCr(n, r));
    }
}