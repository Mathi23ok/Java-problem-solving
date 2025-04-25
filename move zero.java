import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
   int c =0;
    int arr[] = new int[s];
    for(int i =0;i<s;i++){
      arr[i] = sc.nextInt();
    }
    for(int i =0;i<s;i++){
      if(arr[i]==0){
        c = c+1;
        continue;
        
      }
      System.out.print(arr[i]+" ");
      
      }
      while(c>0){
        System.out.print("0 ");
        c--;
      }
      
     
    }
   
  }

