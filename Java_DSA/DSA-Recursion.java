public class RecursionDemo {
   public static void main(String[] args){
      RecursionDemo recursionDemo = new RecursionDemo();
      int n = 5;
      System.out.println(Factorial of  + n +  
         + recursionDemo.factorial(n));
      System.out.print(Fibbonacci of  + n +  );
      for(int i=0;in;i++){
         System.out.print(recursionDemo.fibbonacci(i) + );            
      }
   }

   private int factorial(int n){
      base case
      if(n == 0){
         return 1;
      }else{
         return n  factorial(n-1);
      }
   }

   private int fibbonacci(int n){
      if(n ==0){
         return 0;
      }
      else if(n==1){
         return 1;
      }
      else {
         return (fibbonacci(n-1) + fibbonacci(n-2));
      }
   }
}