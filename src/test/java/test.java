import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Curr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import query.Exchange;
import query.QueryClass;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class test {

    static Exchange[] exchange;
    Curr currency;

    public test(Curr currency) {
        this.currency = currency;
    }

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Curr.values());
    }
    @Test
    public void toarray() {
        ObjectMapper om = new ObjectMapper();
        try {
            exchange = om.readValue(QueryClass.getRest(currency.getLink()), Exchange[].class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void test1() {
        System.out.println("Rate of UAH to " + exchange[0].cc + ": " + exchange[0].rate);
    }


}
