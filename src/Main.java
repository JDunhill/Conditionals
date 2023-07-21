import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type two numbers: ");
        double num1 = Integer.parseInt(scanner.nextLine());
        double num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("The larger number is: " + Math.max(num1, num2));

        System.out.println("Another number please: ");
        double num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(num3 + (num3 % 2 == 0 ? " is even" : " is odd"));

        System.out.println("Please provide a traffic light colour: ");
        String trafficLight = scanner.nextLine();
        switch (trafficLight) {
            case "green":
                System.out.println("Go");
                break;
            case "orange":
                System.out.println("Ready");
                break;
            case "red":
                System.out.println("Stop");
                break;
        }
    }
}
