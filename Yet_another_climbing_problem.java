import java.util.Scanner;
public class Climbing{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int c=0,d,s;
            if(y>x)
            {
                System.out.println(x);
            }
            else
            {
                d=x/y;
                s=x-(d*y);
                c=d+s;
                System.out.println(c);
            }
        }
    }
}