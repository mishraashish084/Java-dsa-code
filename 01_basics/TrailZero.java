import java.util.Scanner;
public class TrailZero{
    
    static int Trailing(int n)
    {
        int result=0;
        int powof5=5;
        while (n>=powof5) {
            result=result+(n/powof5);
            powof5=powof5*5;
            
        }
        return result;

    }
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the factorial number=");
    int n=sc.nextInt();
    System.out.println("Number of Trailing Zeros:" +Trailing(n));
}


}