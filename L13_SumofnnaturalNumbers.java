import java.util.*;
public class L13_SumofnnaturalNumbers {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        int c = 1;
        while(c<=n){
            sum+=c;
            c++;
        }
        System.out.print(sum);
    }
    
}
