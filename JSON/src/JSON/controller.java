package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.text.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class controller {

    public static void parse() throws IOException, ParseException, FileNotFoundException {

        JSONParser radioParsed = new JSONParser();

        try (FileReader reader = new FileReader("radio.json")) {
            Object myRadio = radioParsed.parse(reader);
            JSONArray radioList = (JSONArray) myRadio;
            radioList.forEach( rad -> parseRadioObject( (JSONObject) rad ) );
            System.out.println("List of Radios");
            System.out.println(radioList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
    public static void parseRadioObject(JSONObject radio) {
        JSONObject radioObject = (JSONObject)radio.get("radio");
        String radioName = (String) radioObject.get("Radio");
        System.out.println(radioName);
    }
}