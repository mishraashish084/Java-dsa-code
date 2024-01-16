import java.util.Scanner;
public class GcdNumber{
   static int GCD(int a, int b)
{
    while(a!=0 && b!=0){

        if(a>b)
        {
            a=a%b;
        }
       else
        {
            b=b-a;
        }

    }
    if(a!=0)
    {
        return a;
    }
    else
    {
        return b;
    }
}    





    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=sc.nextInt();
        System.out.println("Enter b=");
        int b=sc.nextInt();
        System.out.println(GCD(a,b));

    }
}
