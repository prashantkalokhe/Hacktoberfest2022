import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
      
        boolean result = m.isUnique(new int[]{1,3,3,4,5,6});
        System.out.println(result);

    }

    public boolean isUnique(int[] arr){

        for (int i = 0 ; i<arr.length ; i++){
            for (int j = i+1 ;j<arr.length ; j++)
                if (arr[j] == arr[i])
                    return false;
        }
        return true;
    }
}


