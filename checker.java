import java.util.*;
class sequence{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
        System.out.print("Enter a size :");
        int size=in.nextInt();
        in.nextLine();
        int[] arr1=new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i]=in.nextInt();
        }
        int target1=10;
        int target2=30;
        int count=0;
        for (int i = 0; i < size; i++) {
            if(arr1[i]==target1||arr1[i]==target2){
                count++;
            }
        }
        if(count==0){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}