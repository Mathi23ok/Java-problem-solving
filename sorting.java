import java.util.*;
//sorting in ascending order
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int arr[] = new int[s];
    for(int i =0;i<s;i++){
      arr[i] = sc.nextInt();
    }//getting inputs
    
  for(int j =0;j<=s;j++){
    for(int k = j+1;k<=s-1;k++){
    if(arr[j]>arr[k]){
      int d = arr[k];
      arr[k] = arr[j];
      arr[j] = d;
  
    }
  }
  }
  
     for(int n =0;n<s;n++){
      System.out.print(arr[n]+ " ");
    }
}
}
//sorting in desending order
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int arr[] = new int[s];
    for(int i =0;i<s;i++){
      arr[i] = sc.nextInt();
    }//getting inputs
    
  for(int j =0;j<=s;j++){
    for(int k = j+1;k<=s-1;k++){
    if(arr[j]<arr[k]){
      int d = arr[k];
      arr[k] = arr[j];
      arr[j] = d;
  
    }
  }
  }
  
     for(int n =0;n<s;n++){
      System.out.print(arr[n]+ " ");
    }
}
}
