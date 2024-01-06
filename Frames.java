import java.util.Scanner;
public class Frames{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int p=2*(l+b);
        int r=p*x;
        System.out.println(r);
    }
}