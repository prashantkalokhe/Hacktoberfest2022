import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.findMissingNumbers(new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10});



    }

    public void findMissingNumbers(int[] arr){

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0 ; i < arr.length ; i++)
            sum1+=arr[i];

        sum2 = 10*(11)/2;

        int diff = sum2 - sum1;

         String result =  diff>0?"missing number is : "+ diff: "no missing number";
         System.out.println(result);
    }

   
}


