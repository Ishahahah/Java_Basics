import java.util.*;
public class L22_SumFunction {
    public static void Sum(int num1 , int num2){
        int s = num1 + num2;
        System.out.println(s);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum(a,b);
    }
    
}
