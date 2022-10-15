import java.util.Scanner;

public class root {
    public static void main(String args[]) {
        double a_1684, b_1684, c_1684, discriminant_1684, root1_1684, root2_1684, realpart_1684, imagpart_1684;
        Scanner sc_1684 = new Scanner(System.in);
        System.out.print("Enter Coefficents a,b and c :");
        a_1684 = sc_1684.nextDouble();
        b_1684 = sc_1684.nextDouble();
        c_1684 = sc_1684.nextDouble();
        sc_1684.close();
        discriminant_1684 = b_1684 * b_1684 - 4 * a_1684 * c_1684;
        if (discriminant_1684 > 0) {
            root1_1684 = (-b_1684 + Math.pow(discriminant_1684, 0.5)) / 2 * a_1684;
            root2_1684 = (-b_1684 - Math.pow(discriminant_1684, 0.5)) / 2 * a_1684;
            System.out.println("root1=" + root1_1684 + " and root2=" + root2_1684);
        } else if (discriminant_1684 == 0) {
            root1_1684 = root2_1684 = -b_1684 / 2 * a_1684;
            System.out.println("root1 and root2=" + root1_1684);
        } else {
            realpart_1684 = -b_1684 / 2 * a_1684;
            imagpart_1684 = Math.pow(-discriminant_1684, 0.5) / 2 * a_1684;
            System.out.println("root1=" + realpart_1684 + "+" + imagpart_1684 + "i and root2=" + realpart_1684 + "-" + imagpart_1684 + "i");
        }

    }
}
