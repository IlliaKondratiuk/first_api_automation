package query;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class QueryClass {
    public static String getRest(String url) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        String ent;
        HttpResponse response;
        try {
            response = client.execute(new HttpGet(url));
            ent = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ent;
    }
}
