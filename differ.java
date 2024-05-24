
// Write a Java program to count the elements that differ by 1 or 
// less between two given arrays of integers with the same length.


import java.util.*;
class sequence{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
        System.out.print("Enter a size :");
        int size=in.nextInt();
        in.nextLine();
        int[] arr1=new int[size];
        int[] arr2=new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i]=in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr2[i]=in.nextInt();
        }
        int count=0;
        for (int i = 0; i < size; i++) {
            if(Math.abs(arr1[i]-arr2[i])<=1 && arr1[i]!=arr2[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}