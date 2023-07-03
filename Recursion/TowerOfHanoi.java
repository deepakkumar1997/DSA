import java.util.Scanner;

class TOH{
    void toh(int n, int A, int B, int C){
        if(n>0){
            toh(n-1, A, C, B);
            System.out.println("Move Disk From "+A+" to "+C);
            toh(n-1, B,A,C);
        }
    }
}

public class TowerOfHanoi{
        public static int A=1;
        public static int B=2;
        public static int C=3;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of disk: ");
        int n = scan.nextInt();
        TOH t = new TOH();
        System.out.println("Steps to move "+n+" disk from tower 1 to 3 using 2:");
        t.toh(n,A,B,C);
    }
}