import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("divide by 3");
        for(int i=1;i<100;i++){
            if(i%3==0){
                System.out.print(i+", ");
            }
        }
        System.out.println("\n\ndivide by 5");
        for(int i=1;i<100;i++){
            if(i%5==0){
               System.out.print(i+", ");
            }
        }
        System.out.println("\n\ndivide by both");
        for(int i=1;i<100;i++){
            if(i%3==0 && i%5==0){
               System.out.print(i+", ");
             }
        }
        }
    }