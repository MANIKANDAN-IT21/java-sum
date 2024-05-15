import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("input :");
        int num=in.nextInt();
        if(num%2==0)
        System.out.println("1");
        else
        System.out.println("0");
    }
}