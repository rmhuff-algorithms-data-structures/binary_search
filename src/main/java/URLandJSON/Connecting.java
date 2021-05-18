package URLandJSON;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class Connecting {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.stackabuse.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        Map<String, String> params = new HashMap<>();
        params.put("v", "dQw4w9WgXcQ");

        StringBuilder requestData = new StringBuilder();

        for (Map.Entry<String, String> param : params.entrySet()) {
            if (requestData.length() != 0) {
                requestData.append('&');
            }
            // Encode the parameter based on the parameter map we've defined
            // and append the values from the map to form a single parameter
            requestData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            requestData.append('=');
            requestData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }

// Convert the requestData into bytes
        byte[] requestDataByes = requestData.toString().getBytes("UTF-8");


    }

}
