import java.util.Scanner;

class HornerRuleRecursion{
    static double sum = 0;
    public double e(int x, int n){
        if(n==0)
            return sum;
        sum = 1+x*sum/n;
        return e(x, n-1);
    }
}

class HornerRuleLoop{
    public double e(int x, int n){
        double sum = 0;
        for(;n>0; n--){
            sum = 1+x*sum/n;
        }
        return sum;
    }
}

public class TaylorSeriesHornerRule{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = scan.nextInt();
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        HornerRuleRecursion er = new HornerRuleRecursion();
        HornerRuleLoop el = new HornerRuleLoop();
        System.out.println("Value of e to the power "+x+" with accuracy "+n+" is "+er.e(x, n));
        System.out.println("Value of e to the power "+x+" with accuracy "+n+" is "+el.e(x, n));
    }
}