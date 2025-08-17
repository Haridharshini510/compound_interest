import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        //compound interest calculator

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the principal amount (in $): ");
        double p = scn.nextDouble();
        System.out.println("Enter the rate (in %) : ");
        double r = scn.nextDouble()/100;
        System.out.println("Enter the times compounded: ");
        int n = scn.nextInt();
        System.out.println("Enter the number of years : ");
        int years = scn.nextInt();

        double in = p*Math.pow(1+r/n,n*years);
        System.out.printf("The compound interest is: %.2f",in);
        scn.close();





    }
}
