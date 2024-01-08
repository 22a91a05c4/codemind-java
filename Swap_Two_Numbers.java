import java.util.Scanner;
public class Weight{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int t=x;
        x=y;
        y=t;
        System.out.println(x);
        System.out.println(y);
    }
}