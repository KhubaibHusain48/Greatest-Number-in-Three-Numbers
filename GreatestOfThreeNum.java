import java.util.Scanner;

public class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = Num.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = Num.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = Num.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greatest");
        } else if (num2 > num1 & num2 > num3) {
            System.out.println(num2 + " is greatest");
        } else if (num3 > num1 & num3 > num2) {
            System.out.println(num3 + " is greatest");
        }
    }
}
