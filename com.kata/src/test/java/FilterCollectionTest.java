
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterCollectionTest {

    @Test
    public void shouldKeepStringsShorterThan4Characters() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(FilterCollection.getStringsShorterThanFourCharacters(collection)).hasSameElementsAs(expected);
    }

}
