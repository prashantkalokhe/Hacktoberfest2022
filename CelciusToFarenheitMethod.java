public class CelciusToFarenheitMethod {
    static float result =0;
    static float conv(float n){
        result = n*(9/5f)+32;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(conv(10));
    }
}
