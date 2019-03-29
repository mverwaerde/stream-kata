import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PeopleStatsTest {

    private Person sara = new Person("Sara", 4);
    private Person viktor = new Person("Viktor", 40);
    private Person eva = new Person("Eva", 42);
    private List<Person> collection = asList(sara, eva, viktor);

    @Test
    public void shouldReturnAverageAge() {
        assertThat(PeopleStats.getStats(collection).getAverage())
                .isEqualTo((double)(4 + 40 + 42) / 3);
    }

    @Test
    public void shouldReturnNumberOfPeople() {
        assertThat(PeopleStats.getStats(collection).getCount())
                .isEqualTo(3);
    }

    @Test
    public void shouldReturnMaximumAge() {
        assertThat(PeopleStats.getStats(collection).getMax())
                .isEqualTo(42);
    }

    @Test
    public void shouldReturnMinimumAge() {
        assertThat(PeopleStats.getStats(collection).getMin())
                .isEqualTo(4);
    }

    @Test
    public void shouldReturnSumOfAllAges() {
        assertThat(PeopleStats.getStats(collection).getSum())
                .isEqualTo(40 + 42 + 4);
    }

}
