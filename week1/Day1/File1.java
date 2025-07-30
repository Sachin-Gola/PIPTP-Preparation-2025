public class File1{
    public static void main(String[] args) {
        fun(40,47);
        
    }
    static void fun(int w,int x){
        int y;
        y=0;
        if(x%w==0 || w%x==0){
            y=y+1;
        }
        else y=y+10;
        System.out.println(y);
    }

    static int  funn(int a,int b){
        if(a && b && a+b >0){   // no comaprision , will give error in java,cpp but works well in python.
            return a+funn(a-2, b-2)+b;
        }
        return a^b;
    }
}