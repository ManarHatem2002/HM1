import  java.util.Scanner;
public class HQ1 {

        public static void inputAllBaseTypes() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a boolean value: ");
            boolean boolValue = scanner.nextBoolean();
            System.out.println("Boolean value entered: " + boolValue);

            System.out.print("Enter a byte value: ");
            byte byteValue = scanner.nextByte();
            System.out.println("Byte value entered: " + byteValue);

            System.out.print("Enter a short value: ");
            short shortValue = scanner.nextShort();
            System.out.println("Short value entered: " + shortValue);

            System.out.print("Enter an int value: ");
            int intValue = scanner.nextInt();
            System.out.println("Int value entered: " + intValue);

            System.out.print("Enter a long value: ");
            long longValue = scanner.nextLong();
            System.out.println("Long value entered: " + longValue);

            System.out.print("Enter a float value: ");
            float floatValue = scanner.nextFloat();
            System.out.println("Float value entered: " + floatValue);

            System.out.print("Enter a double value: ");
            double doubleValue = scanner.nextDouble();
            System.out.println("Double value entered: " + doubleValue);

            System.out.print("Enter a char value: ");
            char charValue = scanner.next().charAt(0);
            System.out.println("Char value entered: " + charValue);

            scanner.close();
        }

        public static void main(String[] args) {
            inputAllBaseTypes();
        }
    }

