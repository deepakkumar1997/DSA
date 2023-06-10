import java.util.Scanner;
class TaylorSeries{
    static double p=1,f=1;
    double taylorSeries(int x, int n){
        double sum=0;
        if(n==0)
            return 1;
        else{
            sum=taylorSeries(x, n-1);
            p*=x;
            f*=n;
            return sum+p/f;
        }
    }
}
// Here, taylorSeries is used to calculate e^x, and n represents accuracy for the value of e^x, if value of n 
// increases then the accuracy of e^x increases, e = 2.71828...
public class TaylorSeriesex{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = scan.nextInt();
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        TaylorSeries e = new TaylorSeries();
        System.out.println("Value of taylor series for x = "+x+" and n = "+n+" is "+e.taylorSeries(x,n));        
    }
}