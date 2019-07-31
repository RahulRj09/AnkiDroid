package ankidroid;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonReaderWriter {
    static void writer(List<Card> cards) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("/Users/rahul.joshi/ankidroidd/src/main/java/ankidroid/cards.json"),
                    cards);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static List<Map<String, Object>> reader() {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            TypeReference<List<Map<String, Object>>> typeReference = new TypeReference<>() {};
            return objectMapper.readValue(new File(
                    "/Users/rahul.joshi/ankidroidd/src/main/java/ankidroid/cards.json"), typeReference);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
