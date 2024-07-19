import java.util.*;
public class L8_PosORNeg {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        float num = sc.nextFloat();
        if(num<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is positive");
        }
    }
}
