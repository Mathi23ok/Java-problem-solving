import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int term = sc.nextInt();
      int a = 3;
      int b = a+2;
    
      boolean s = false;
      for(int i =1;i<=term*2;i++){
        for(int j =1;j<=a;j++){
          if(a%2!=0 && b%2!=0){
          if(a%j==0 && b%j==0){
            s = false; //c = 1
            break;
          }
        }
        }//c = 2
        if(!s){
            System.out.print(a+" ");
            System.out.print(b+" ");
            System.out.println();
          
        }
        s = true;
         a++;
         b++;
      }
 
}
}

//another approach
import java.util.*;
public class Main {
public static void main(String args[]){
 Scanner obj = new Scanner(System.in);
 int n = obj.nextInt();
 int count = 0 ; 
 boolean flag = true , flag2 = true;
 for(int first=2; count < n ; first++) {
   flag = true ; flag2 = true;
   for(int j=2;j<=first/2; j++){
     if( first % j == 0) {
       flag = false ; 
       break;
     }
   }
for(int j=2,second=first+2;j<=second/2;j++){
     if( second % j == 0) {
       flag2 = false ; 
       break;
     }
   }
   if(flag && flag2) {
   System.out.println(first+" "+(first+2));
   count++; 
   }
 }
 }
}
