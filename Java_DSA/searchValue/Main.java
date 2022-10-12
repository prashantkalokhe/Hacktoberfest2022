import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main m = new Main(); 

        m.linearSearch(new int[]{1,3,4,5,6} , 16);

    }
   

    public void linearSearch(int []arr , int value){

        for (int i = 0 ;  i<arr.length ; i++)
            if (arr[i] == value){
                System.out.print(value + " found at index "+i);
                return;
            }
        System.out.println(value+" is not found");

    }
}


