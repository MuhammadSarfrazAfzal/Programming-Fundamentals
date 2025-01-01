import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("I am ");
        String name = scanner.nextLine();
        byte age = scanner.nextByte();
        System.out.println("This is " + name + age);
    }
}
