import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1;i<=b;i++){
          System.out.printf("%d * %d = %d",a,i,a*i);
          System.out.println("");
        }
     
  }
}
