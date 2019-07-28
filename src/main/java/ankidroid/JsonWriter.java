package ankidroid;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonWriter {
    static void writer(List<Card> cards){
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("/Users/rahul.joshi/ankidroidd/src/main/java/ankidroid/cards.json"),
                    cards );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
