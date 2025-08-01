
import java.util.*;
public class file5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rec(n));
    }
    public static String rec(int n){
        if(n==1) return "1";
        return rec(n-1)+Integer.toString(n)+rec(n-1);
    } 
}
