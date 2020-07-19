package Sample.Wtn;

public class ArrayCall {
            static int Mini(int arr[]) {
              int min = arr[0];
              for(int i = 0; i < arr.length; i++) {
                if(min > arr[i])
                  min = arr[i];
              }
              return min;
            }
  public static int[] get(){
    return new int[]{10, 20, 30};
  }
  
  public static void main(String args[]) {
    int arr[] = new int[] {1,2,3,4,5};
    int x = ArrayCall.Mini(arr);
    int arr1[] = ArrayCall.get();
    for(int i : arr1)
    System.out.println(i);
    System.out.println(x);
  }
}