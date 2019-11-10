import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    
    System.out.println("Below are models of radios:");

    Set<String> radios = new HashSet<>();
    radios.add("MDS9710");
    radios.add("MDS4710");
    radios.add("SD9");
    radios.add("SD4");
    System.out.println(radios);

    String repeat = "y";
    while (!"n".equals(repeat)) {

      Scanner input = new Scanner(System.in);
      System.out.print("Please enter a new radio:");
      String newRadio = input.next();
    
      if (radios.add(newRadio)) {
        System.out.println("You've added " + newRadio +".");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Would you like to try again - y/n?");
        repeat = input2.next();
      } else if (!radios.add(newRadio)) {
        System.out.println(newRadio + " already exists.");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Would you like to try again - y/n?");
        repeat = input3.next();
      }
    }
    System.out.println("The final list: " + radios + ". Thank you!");
  }
}