import java.util.*;
class Mani{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int size=in.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        float sum=0;
        for(int i=0;i<size;i++){
            sum=arr[i]+sum;
        }
        float avg=sum/5;
        System.out.print(avg+" ");
        
    }
}