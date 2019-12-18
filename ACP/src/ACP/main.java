package ACP;
//Sited Works:
//https://www.youtube.com/watch?v=SXsqCafXBjw&list=PLB3Kbg6ME7sgvwrQsHRSfMZbhPjdV2d9v&index=10&t=157s
//https://www.javaguides.net/2018/08/application-controller-design-pattern-in-java.html
//https://stackoverflow.com/questions/9346466/strings-and-while-loops
import java.util.Scanner;
public class main {
    public static void main(String[]args) {
        controller control = new controller();

        Integer input_one;
        Integer input_two;
        String operator;
        String input = "";

        do {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        try {
            input_one = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            input_one = 0;
        }
        System.out.println("Select an operator (+, -, *, /): ");
        operator = in.nextLine();
        System.out.println("Enter second number: ");
        try {
            input_two = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            input_two = 0;
        }
        System.out.println("*******************");
        System.out.println(input_one + " " + operator + " " + input_two + " = ");
        System.out.println(control.hashMaps(operator, input_one, input_two));
        System.out.println("********************");
        System.out.println("Would you like to do another calculation? y/n");
        input = in.nextLine();
        } while (!input.equals("n"));
        System.exit(0);
    }
}