import java.util.*;

public class PeakElement{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int arr[] = new int[size];
      for(int i = 0;i<size;i++){
        arr[i] = s.nextInt();
      }
      if(arr[0]>arr[1]){
        System.out.println(arr[0]);
      }
      if(arr[arr.length-1]>arr[arr.length-2]){
        System.out.println(arr[arr.length-1]);
      }
      for(int i=1;i<arr.length-1;i++){
        if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
          System.out.println(arr[i]);
        }
      }
  }
}