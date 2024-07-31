import java.util.*;

public class EqualArrays {
    public static void main(String[] args) {
      int arr1[] = {1,2,3,4};
      int arr2[] = {1,2};
      boolean flag = false;
      if(arr1.length!=arr2.length){
        flag = false;
      }
      else{
        for(int i = 0;i<arr1.length;i++){
          if(arr1[i]!=arr2[i]){
            flag = false;
            break;
          }
        }
        flag = true;
      }
      if(flag){
        System.out.println("The given arrays are same");
      }
      else{
        System.out.println("The given arrays are not same");
      }
  }
}
