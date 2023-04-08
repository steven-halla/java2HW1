import java.util.Scanner;

public class DecimalToHexConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        String hex = decimalToHex(decimal);
        System.out.printf("Hexadecimal value of %d is %s%n", decimal, hex);
    }

    public static String decimalToHex(int value) {

        //if value is 0, return 0
        if (value == 0) {
            return "0";
        }
        //our hex var is set to an empty string
        String hex = "";
        //turn decimal to hexadeciaml by dividign
        while (value > 0) {
            int remainder = value % 16;
            //if remiander is < 10,  append to hexidceimal character
            if (remainder < 10) {
                hex = remainder + hex;
            } else {
                hex = (char)('A' + remainder - 10) + hex;
            }
            value /= 16;
        }
        return hex;
    }
}

