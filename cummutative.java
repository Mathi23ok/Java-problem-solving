import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int c = 0;
    int arr[] = new int[s];
    for(int i =0;i<s;i++){l
      arr[i] = sc.nextInt();
    }
    
    
    for(int i =0;i<s;i++){
      int d = c+arr[i];
        System.out.printf("%d ",d);
        c = d;
        
     
      
     
    }
   
  }
}
