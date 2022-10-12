import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

    int[]arr =   m.twoSum(new int[]{2 , 13 , 7 , 15} , 20);
      System.out.println(Arrays.toString(arr));


    }


    public int[] twoSum(int []arr , int target){
        for (int i = 0 ; i < arr.length ; i++){

            for (int j = i+1 ; j<arr.length ; j++)
                if (arr[i]+arr[j] == target)
                    return new int[]{i , j};
        }

        throw new IllegalArgumentException("no solution found");
    }

  
}


