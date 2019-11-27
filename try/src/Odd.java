import java.util.*;

public class Odd {
    public static void main(String args []){
        int num1,num2;
        System.out.println("Enter the number 1:");
        Scanner a = new Scanner(System.in);
        num1 =a.nextInt();
        System.out.println("Enter the number 2:");
        Scanner b = new Scanner(System.in);
        num2 =b.nextInt();
        System.out.print("Odd number:");
        System.out.println();
    for(int i = num1;i<=num2;i++){
            if(i%2==0){
                System.out.print(i);
                System.out.println();
            }

        }
        System.out.println("Even number:");
        for(int i = num1;i<=num2;i++){
            if(i%2 !=0){
                System.out.print(i);
            }

        }



    }



}
