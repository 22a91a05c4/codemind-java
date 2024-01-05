import java.util.Scanner;
public class Hypeotenuse{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=(a*a)+(b*b);
        double hyp=Math.sqrt(c);
        System.out.printf("%.2f",hyp);
    }
}