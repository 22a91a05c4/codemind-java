import java.util.Scanner;
public class Frames{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            int r3=sc.nextInt();
            int c=0;
            if(r1>(r2+r3) || r2>(r1+r3) || r3>(r2+r1))
            {
                c++;
            }
            if(c>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}