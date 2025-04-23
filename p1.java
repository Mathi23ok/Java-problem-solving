import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      int a = sc.nextInt();
      if(a<=100 && a>=1){
        if(a%2==0){
          System.out.println("YES");
          if((a/2)%2==0){
            System.out.printf("%d %d",(a/2),(a/2));
          }else{
            System.out.printf("%d %d",(a/2)-1,(a/2)+1);
          }
        }else{
          System.out.print("NO");
        }
      }else{
        System.out.print("Invalid Input");
      }
          
  }
}
