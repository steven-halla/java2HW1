//reads input from a user
import java.util.Scanner;

public class DecimalToBinary {
    public static String decimalToBinary(int value) {
        //the stringBuilder is a built in class
        StringBuilder binary = new StringBuilder();

        //appends 0 if value is 0
        if (value == 0) {
            binary.append("0");
        }

        //converts code to binary
        while (value > 0) {
            int remainder = value % 2;
            binary.insert(0, remainder);
            value = value / 2;
        }

        //if the input was 1, append a "1"
        if (binary.toString().equals("")) {
            binary.append("1");
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks users to enter number
        System.out.print("Enter a decimal number: ");
        int decimalValue = scanner.nextInt();

        //turns decimal to binary
        String binaryValue = decimalToBinary(decimalValue);
        System.out.println("The binary of " + decimalValue + " is: " + binaryValue);

        scanner.close();
    }
}
