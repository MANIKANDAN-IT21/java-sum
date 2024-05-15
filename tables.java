import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int size=10;
        for(int i=1;i<=size;i++){
            System.out.println(num+" x "+i+" = "+i*num );
        }
    }
}