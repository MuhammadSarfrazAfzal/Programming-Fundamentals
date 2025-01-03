import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "Start";
        if (userInput == "Start") {
            System.out.println("Give a Number");
            byte userNumber = scanner.nextByte();
            System.out.println("Your Given Number is" + userNumber);
        }
    }
}
