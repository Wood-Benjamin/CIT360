package JSON;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class model {
    public static void map() throws IOException, ParseException {
        //cnReach N500 Cambium Radios
        JSONObject cnReach = new JSONObject();
        cnReach.put("N500 450", "NB-N500001A-US");
        cnReach.put("N500 220", "NB-N500004A-US");
        cnReach.put("N500 700", "NB-N500002A-US");
        cnReach.put("N500 900, Spare", "NB-N500003A-US");

        JSONObject radioPartNum = new JSONObject();
        radioPartNum.put("radio", cnReach);

        //xetaWave Xeta9 Xetawave Radios
        JSONObject xetaWave = new JSONObject();
        xetaWave.put("XETA9X9", "XETA9-12IMLFC");
        xetaWave.put("XETA9", "XETA9-22DMLFC");
        xetaWave.put("XETA4", "XETA9-22IPLFC ");
        xetaWave.put("XETA7", "XETA9-27IPLFC ");

        JSONObject radio2PartNum = new JSONObject();
        radio2PartNum.put("radio2", xetaWave);

        JSONArray radioList = new JSONArray();
        radioList.add(radioPartNum);
        radioList.add(radio2PartNum);

        try (FileWriter file = new FileWriter("radio.json")) {

            file.write(radioList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        view.radioView();
    }

}
