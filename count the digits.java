import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int c =0;
      while(a>0){
        a = a/10;
        c++;
      }
      System.out.print(c);
     
  }
}
