// Ozbirn, 09/03/14

public class Mailbox<T>
{
   private T value;

   public void setValue(T v)
   {
      value = v;
   }
   
   public T getValue()
   {
      return value;
   }

   public static void main(String args[])
   {
      Mailbox<Integer> mb = new Mailbox<>();
      
      mb.setValue(10);
      
      int myval = mb.getValue();
      
      System.out.println(myval);
      
      Mailbox<String> mb2 = new Mailbox<>();
      
      mb2.setValue("Hello");
      
      String myval2 = mb2.getValue();
      
      System.out.println(myval2);
   
   }
}