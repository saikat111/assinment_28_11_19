import java.util.*;
public class P
{
    public static void printTriagle(int n)
    {
        for (int i=0; i<n; i++)
        {

            for (int j=n-i; j>1; j--)
            {

                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n ;
     Scanner a;
     System.out.println("Enter the number:");
     a = new Scanner(System.in);
     n = a.nextInt();
        printTriagle(n);
    }
}
