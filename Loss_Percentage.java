import java.util.Scanner;
public class Frames{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double g=(y/x)*100;
        double l=100-g;
        System.out.printf("%.2f",l);
    }
}