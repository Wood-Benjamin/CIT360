package ACP;

import java.util.HashMap;

public class controller {
    public static HashMap<String, calculation> hashMapOfOperation = new HashMap<String, calculation>();
    public controller() {

    }
    public Integer hashMaps(String operator, Integer input_one, Integer input_two) {
        try {
            hashMapOfOperation.put("+", new add());
            hashMapOfOperation.put("-", new subtract());
            hashMapOfOperation.put("*", new multiply());
            hashMapOfOperation.put("/", new divide());
            calculation math = hashMapOfOperation.get(operator);
            return (math.numbers(input_one, input_two));
        } catch (Exception e) {
            System.out.println("Sorry, something went wrong.");
            System.out.println("Please check your work and try again.");
        }
        return 0;
    }
}
