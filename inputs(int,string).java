import java.util.*;
class sequence{
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter tamil :");
    int tamil=in.nextInt();
    in.nextLine();
    System.out.print("Enter Eng :");
    int eng=in.nextInt();
    in.nextLine();
    System.out.print("Enter name: ");
    String name=in.nextLine();
        System.out.println("All details");
        System.out.println("tamil mark "+tamil);
        System.out.println("English mark "+eng);
        System.out.println("student name "+name);
}
}