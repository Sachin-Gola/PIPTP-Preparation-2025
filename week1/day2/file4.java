

public class file4 {
    public static void main(String[] args) {
        System.out.println(fun(2,7));
    }
    static int fun(int x,int y){
        if(x==y) return x*y;
        return fun(x,(x+y)/2)+fun((x+y)/2+1,y);
    }
}
