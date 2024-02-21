import java.util.*;
public class sum1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0,r;
        while(a!=0)
        {
            r=a%10;
            c++;
            a=a/10;
        }
        System.out.println(c);
    }
}