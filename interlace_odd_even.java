import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int codd = 0;
    int ceven = 0;
    for(int i = a;i<=b;i++){
      if(i%2==0){
        ceven = ceven + 1;
      }else{
        codd = codd + 1;
      }
    }
    if(codd>ceven){
      for(int j = a,k = b-1;j<=b || k>=a;j = j+2,k=k-2){
        System.out.print(j+" ");
        if(k<a){
           continue;
        }
        System.out.print(k+" ");
               
      }
      }else{
        for(int m = b,n = a+ 1;m>=a || n<=b;m = m-2,n=n + 2){
        System.out.print(m+" ");
       
        if(n>b){
          break;
        }
                System.out.print(n+" ");
      }
    }
  }
}
//interlace odd and even 
//input :4 14
//output:14 5 12 7 10 9 8 11 6 13 14
//input :5 11
//output:5 10 7 8 9 6 11

//
