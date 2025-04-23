import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int f = 0;
      int s = 1;
      int m=f;
      for(int i =0;i<n;i++){ 
          System.out.print(m+" ");
          f=s;
          s = m;
          m=s+f;
      }
  
  }
}
//Write a program to print the fibonnaci series
