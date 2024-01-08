import java.util.Scanner;
public class Weight{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int avg=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=(3*avg)-x-y;
        System.out.println(z);
    }
}