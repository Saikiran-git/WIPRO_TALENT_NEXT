/*package Sample.Wtn;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwoMaxMin {
	 public static void main(String[] args) throws java.lang.Exception{
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) 
				arr[i] = sc.nextInt();
			Arrays.sort(arr);
			System.out.println("Max 2 are "+arr[n - 1]+" and "+arr[n - 2]);
			System.out.println("Max 2 are "+arr[0]+" and "+arr[1]);
			sc.close();
	 }
}*/

package Sample.Wtn;
import java.util.Scanner;
public class ArrayTwoMaxMin {
    public static void main(String args[])throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);  
        int n= sc.nextInt();     
      int[] arr = new int[n];                   
      for(int i = 0; i <n; i++)  
          arr[i] = sc.nextInt();
      int max1 = 0, max2 = -1, min1 = 0, min2 = -1;
      for(int i = 0; i < n; i++){
          if(arr[i] > arr[max1])
          max1 = i;
      }
      for(int i = 0; i < n; i++){
          if(max2 == -1 && i != max1)
          	max2 = i;
          else if(max2 != -1 && arr[i] > arr[max2] && i != max1)
          	max2 = i;
      }
      for(int i = 0; i < n; i++){
          if(arr[i] < arr[min1])
          min1 = i;
      }
      for(int i = 0; i < n; i++){
          if(min2 == -1 && i != min1)
          	min2 = i;
          else if(min2 != -1 && arr[i] < arr[min2] && i != min1)
          	min2 = i;
      }
      System.out.println("max1 is "+arr[max1]);
      System.out.println("max2 is "+arr[max2]);
      System.out.println("min1 is "+arr[min1]);
      System.out.println("min2 is "+arr[min2]);
      sc.close();
    }
}
