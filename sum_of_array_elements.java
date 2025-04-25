import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int sum =0;
    int arr[] = new int[s];
    for(int i =0;i<s;i++){
      arr[i] = sc.nextInt();
    }
    for(int i =0;i<s;i++){
      sum = sum+arr[i];
    }
    System.out.print(sum);
  }
}
