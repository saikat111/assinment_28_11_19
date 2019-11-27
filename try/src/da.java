import java.util.*;
public class da {
    public static void main(String args[]){
        int n;
        Scanner a;
        a = new Scanner(System.in);
        n =a.nextInt();
        int num[] = new int[n];
        for(int i = 0; i<n;i++){
            num[i] = a.nextInt();

        }
       System.out.println(num.length);


    }

}
