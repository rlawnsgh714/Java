package mealService;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class main {
    public static void main(String[] args) throws MalformedURLException {
        String newUrls = "https://open.neis.go.kr/hub/mealServiceDietInfo" +
                "?Type=json" +
                "&ATPT_OFCDC_SC_CODE=D10" +
                "&SD_SCHUL_CODE=7240454" +
                "&MLSV_FROM_YMD=20220504";
        try {
            URL url = new URL(newUrls);

                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(url.openStream(), "utf-8"));
                    System.out.println(br.readLine());

                    StringBuffer sb = new StringBuffer();
                    String msg = "";
                    while ((msg = br.readLine()) != null) {
                        sb.append(msg);
                    }
                    JSONParser jsonParser = new JSONParser();
                    JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());

                    JSONArray jsonArray = (org.json.simple.JSONArray) jsonObject.get("mealServiceDietInfo");
                    JSONObject row = (JSONObject) jsonArray.get(1);
                    JSONArray row_array = (JSONArray) row.get("row");

                    for(int i=0;i<row_array.size();i++){
                        JSONObject out = (JSONObject) row_array.get(i);
                        System.out.println(out.get("Meal_SC_NM"));
                        for(String value : ((String) out.get("DDISH_NM")).split("<br/>")) {
                            System.out.println("  - " + value);
                        }
                    }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
