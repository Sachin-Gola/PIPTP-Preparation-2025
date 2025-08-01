

public class file3 {
    public static void main(String[] args) {
        System.out.println(function(5,3));
    }
    static int function(int x,int y){
        if(y==0 || y==x) return 1;
        return function(x+1, y)+function(x-1, y-1);
    }
}
