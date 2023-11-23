import java.util.Scanner;

public class Power {
    public static double myPow(double x, long n){
        if(n<0){
            n = -n;
            x=1/x;
        }
        if(n == 1 || n == 0){
            return x;
        }
        double temp = myPow(x,n/2);
        if(n%2==0){
            return temp*temp;
        }else{
            return temp*temp*x;
        }
    }
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        long n = scan.nextInt();
        double number = myPow(x,n);
        System.out.println(number);
    }
}
