import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int arr[] = new int[s];
    for(int i =0;i<s;i++){
      arr[i] = sc.nextInt();
    }//getting inputs
    
 if(s%2==0){
  for(int j =0,k = j+1;j<s || k<s-1;j++,k++){
     System.out.print(arr[k]+ " ");
      System.out.print(arr[j]+ " ");
      k++;
      j++;
     
    }
  }
  else{
     for(int j =0,k = j+1;j<s && k<s-1;j++,k++){
     System.out.print(arr[k]+ " ");
      System.out.print(arr[j]+ " ");
      k++;
      j++;
    }
    System.out.print(arr[s-1]);
  }
  
    }
}
//adjacent element swapping 
//input :6 
//1 2 3 4 5 6
//output:
//2 1 4 3 6 5
//input 2:5
//1 2 3 4 5
//output
//2 1 4 3 5
