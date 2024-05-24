import java.util.*;
class sequence{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter size :");
        int size=in.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}