import java.util.*;
public class sum1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0,c,r,q;
        q=a%10;
        while(a!=0)
        {
            r=a%10;
            s=s*10+r;
            a=a/10;
        }
        c=q+(s%10);
        System.out.println(c);
    }
}