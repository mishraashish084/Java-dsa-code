import java.util.*;
public class PrimeBwNumber{
    static void PrimeNum(int n)
    {
        for(int i=2;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number=");
        int n=sc.nextInt();
        PrimeNum(n);
    }
}