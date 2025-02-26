import java.util.Scanner;
public class EvenOddChecker {
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        return integer;
    }
    public static void checkEvenOrOdd(int integer) {
        if (integer % 2 != 0) {
            System.out.println(integer + "is an Odd number");
        } else {
            System.out.println(integer + "is an Even number");
        }
    }
    
    public static void main(String[] args) {
        checkEvenOrOdd(getIntegerInput());
        checkEvenOrOdd(getIntegerInput());
    }
}
