import java.util.*;
public class salary{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double bs=sc.nextDouble();
        double hr=sc.nextDouble();
        double da=sc.nextDouble();
        double pf=bs*(0.12);
        double gs=bs+hr+da+pf;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",gs);
    }
}