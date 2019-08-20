// Ozbirn, 09/03/14

public class RecursiveSums
{
   public static int sum(int arr[], int i)
   {
      if (i == arr.length - 1)
         return arr[i];      
      else
         return arr[i] + sum(arr, i+1);   
   }
   
   public static int sum2(int arr[], int left, int right)
   {
      if (left == right)
         return arr[left];
      else
      {
         int center = (left + right)/2;
         
         int leftsum = sum2(arr, left, center);
         int rightsum = sum2(arr, center+1, right);
         
         return leftsum+rightsum;      
      }   
   }
   
   
   public static void main(String args[])
   {
      int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
      
      int mysum = sum(arr, 0);
      
      System.out.println("Sum is: " + mysum);
   
      int mysum2 = sum2(arr, 0, arr.length-1);
      
      System.out.println("Sum is: " + mysum2);
       
   }

}