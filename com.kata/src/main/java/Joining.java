import java.util.List;

import static java.util.stream.Collectors.joining;

public class Joining {

    public static String transformNamesWithCommaSeparator(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }
}
