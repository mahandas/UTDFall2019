// Ozbirn, 08/31/15

public class Recursion
{
   // sum numbers in the array that are greater than 3
   public static int sum(int arr[], int i)
   {
      if (i == arr.length)
          return 0;
      else
          if (arr[i] > 3)
             return arr[i]  +   sum(arr, i+1);
          else
             return sum(arr, i+1);
   }

   public static void main(String args[])
   {
      int arr[] = { 1, 2, 3, 4, 5 };
      
      int arrsum = sum(arr, 0);
      
      System.out.println("The sum is: " + arrsum);
   }
}