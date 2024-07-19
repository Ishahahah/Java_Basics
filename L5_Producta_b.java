import java.util.*;
public class L5_Producta_b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        float m = sc.nextFloat();
        System.out.print("Enter n : ");
        float n = sc.nextFloat();
        float multiply = m * n;
        System.out.print(multiply/n);
        System.out.print("Area of circle (Enter r): ");
        float r = sc.nextFloat();
        float area = 3.14f * r * r ;
        System.out.print(area);

    }
}
