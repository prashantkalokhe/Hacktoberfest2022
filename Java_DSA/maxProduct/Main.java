import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
       

     String result =   m.maxProduct(new int[]{10,20,30,40 , 50});
     System.out.println(result);

      

    }

    

    public String maxProduct(int []arr){
        int max = 0;
        String pair=  "";

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if (arr[i]*arr[j] > max){
                    max = arr[i]*arr[j];
                    pair = i +","+j;
                }
            }


            }
        return pair;
    }

}


