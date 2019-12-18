package JSON;

import java.text.ParseException;
import java.io.IOException;

public class view {
    public static void radioView() throws IOException, ParseException  {
        System.out.println("List of Radios");
        controller.parse();
    }
}
