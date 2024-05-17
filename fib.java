class Mani{
    public static void main(String[] args){
        int a=0;
        int b=1;
        int num=7;
        int i=2;
        while(i<=num){
          int temp=b;
          b=b+a;
          a=temp;
          i++;
        }
        System.out.println(b);
    }
}