import java.util.*;
public class L12_WhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Printing from 1 to ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
}
