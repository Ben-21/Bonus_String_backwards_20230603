import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        stringBackwards();


    }


    public static void stringBackwards() {
        System.out.println("Bitte geben Sie einen String ein: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        int length = inputArray.length;

        for (int i = (length - 1); i >= 0; i--) {
            System.out.print(inputArray[i] + " ");

        }


    }


}
