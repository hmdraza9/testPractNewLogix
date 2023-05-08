package JavaUtils;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONReaderClass {

    public static void JSONReaderMethod() throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";

        try {
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            // Fetching a specific value
            String name = (String) jsonObject.get("name");
            System.out.println("Name: " + name);

            int age = ((Long) jsonObject.get("age")).intValue();
            System.out.println("Age: " + age);

            String city = (String) jsonObject.get("city");
            System.out.println("City: " + city);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static void JSONReaderFromFileMethod() throws IOException, ParseException {


        BufferedReader br = new BufferedReader(new FileReader("JSONData\\TestJSON.json"));
        String line="";
        StringBuilder sb = new StringBuilder();

        while((line=br.readLine())!=null){
            sb.append(line);
        }

        JSONParser parser = new JSONParser();
        JSONObject  jsonObject = (JSONObject) parser.parse(sb.toString());
        String quiz = (String) jsonObject.get("quiz");
        System.out.println(quiz);
    }
}
