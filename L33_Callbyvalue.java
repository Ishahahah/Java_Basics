public class L33_Callbyvalue {
    public static void call(int a){
         a = 10;
        System.out.println(a);
    }

    public static void main(String args[]){
        int x = 5;
        System.out.println(x);
        call(x);
    }
    
}
