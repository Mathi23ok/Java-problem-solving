import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
     int org = a;
     int n=1;
  int s =0;
     int d =0;
     while(a>0){
       a = a/10;
       d+=1;
     }
     a = org;
     while(a>0){
       int c = a%10;
       for(int i =1;i<=d;i++){
         n =n*c;
       }
          s = s+n;
         n =1;
       a = a/10;
     }
     if(s==org){
       System.out.print("YES");
     }else{
       System.out.print("NO");
     }
    }
}
//Another solution
import java.util.*;
public class Main {
public static void main(String args[]){
 Scanner obj = new Scanner(System.in);
 int a = obj.nextInt();
 int temp = a , Armstrong = 0 , count = 0 , power=1; 
 while(temp > 0 ){ 
   count++; 
   temp/=10;
 } 
 temp = a ; 
 while( temp > 0) {  
   for(int i=1;i<=count;i++) {  
     power *= (temp%10) ;  
   }
   Armstrong += power ; 
   power = 1 ; 
   //Armstrong += Math.pow(temp%10,count);
   temp/=10 ;  
 }
 System.out.print((a==Armstrong)?"YES":"NO");
 }
}
