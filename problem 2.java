//to check whether the number contain even digits and start andend with 1,if it so then print no else yes
import java.util.*;
public class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int count = 0 , answer = 1 , temp = n ; 
  boolean flag = false ; 
  while( n > 0) {
    count++; n/=10 ; 
  }
  for(int i=1;i<count;i++){
    answer *= 10 ;
  }
  if( temp/answer== 1 || temp%10== 1 ){
    flag = true ; 
  }
  else {
    while(temp > 0){
      if((temp%10)%2 == 0 ) {
      flag = true ; 
      break; }
      temp/=10;
    }
  }
  System.out.print((flag==false)?"yes":"no");
  }
}
