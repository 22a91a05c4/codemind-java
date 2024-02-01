import java.util.*;
public class years{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int c=y%100;
        int l=(int)Math.log10(c)+1;
        if(l==2)
        {
            System.out.print(c);
        }
        else
        {
            System.out.print("0"+c);
        }
    }
}