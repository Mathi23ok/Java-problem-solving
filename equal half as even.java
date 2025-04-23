
///the input should be in the range of 1 to 100,if the range exceeded then print invalid input then if the number is divisible by 2 then print yes if not print no///
//then the value should be divided into half ,and need to give the outout in even numbers eg output should be as 4 4, 6 8

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
