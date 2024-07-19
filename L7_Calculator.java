import java.util.*;
public class L7_Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter num2 : ");
        float num2 = sc.nextFloat();
        System.out.println("Enter the operation you want do");
        char operator = sc.next().charAt(0);

        
        switch (operator) {
            case '+':
                System.out.print("Addititon :");
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.print("Substration :");
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.print("Multiplication :");
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.print("Division :");
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.print("Remainder:");
                System.out.println(num1 % num2);
                break;
        
            default:
                System.out.print("Wrpng Operator");
                break;
        }
    }
}
