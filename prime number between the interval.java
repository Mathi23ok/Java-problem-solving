import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
        int b = sc.nextInt();
        int c =0;
        for(int i = a;i<=b;i++){
          for(int j =1;j<=i;j++){
            if(i%j==0){
              c+=1;
            }
          }
          if(c==2){
            System.out.print(i+" ");
          }
          c = 0;
        }
  }
}
//optimistic approach with flag
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
        int b = sc.nextInt();
        boolean c = true;
        for(int i = a;i<=b;i++){
          for(int j =2;j<=i/2;j++){
            if(i%j==0){
              c = false;
              break;
            }
          }
          if(c){
            System.out.print(i+" ");
          }
          c = true; //reassign the value
        }
  }
}
