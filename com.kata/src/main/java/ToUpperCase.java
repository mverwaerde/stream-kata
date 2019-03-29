import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ToUpperCase {

    public static List<String> toUppercase(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            newCollection.add(element.toUpperCase());
        }
        return newCollection;
    }
}
