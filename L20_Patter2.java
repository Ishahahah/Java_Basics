import java.util.*;
public class L20_Patter2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){    //i=line
            for(int j=1; j<=n-i+1; j++){    //j =star
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
