
public class file2 {
    public static void main(String[] args) {
        System.out.println(function(3));
        System.out.println(function(4));
        System.out.println(function(5));
        System.out.println(function(6));
    }
    static int function(int n){
        if(n<=1) return n;
        else{
            if(n%2==0){
                return n+function(n/2);
            }
            else return function((n+1)/2)+function((n-1)/2);
        }
    }
}
