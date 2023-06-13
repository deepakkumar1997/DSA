import java.util.Scanner;
class Power{
    public int pow(int m, int n){
        if(n==0)
            return 1;
        else return pow(m, n-1)*m;
    }
}
class EnhancedPower{
    public int pow(int m, int n){
        if(n==0)
            return 1;
        else if(n%2==0)
            return pow(m*m, n/2);
        else return m*pow(m*m, (n-1)/2);
    }
}
public class PowerOfmn{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = scan.nextInt();
        System.out.print("Enter exponent value: ");
        int e = scan.nextInt();
        Power p = new Power();
        EnhancedPower ep = new EnhancedPower();
        System.out.println("Value of "+base+" to the power "+e+" is "+p.pow(base, e));
        System.out.println("Value of "+base+" to the power "+e+" is "+ep.pow(base, e));
    }
}