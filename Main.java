import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Iterator;

import org.json.*;
import org.json.simple.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Main {

    private static final String OUTPUT_FILENAME = "output.txt";
    private static final String INPUT_FILENAME = "/Users/ra186066/Documents/github/Temp/src/mainTemplate.json";
    public static void main(String[] args) {
        System.out.println("Hello World!");
        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader(INPUT_FILENAME));
            JSONObject jsonObject = (JSONObject) obj;

            JSONObject attributes =  (JSONObject) jsonObject.get("parameters");
            //System.out.println("fas");
            BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILENAME));
            for (Object parameter : attributes.keySet()){
                bw.write((String)parameter);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
