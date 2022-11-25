import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindMinMaxTest {

    @Test
    void findMin() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);

        int minValue = FindMinMax.find(MinMax.Min, numbers);
        assertEquals(1, minValue);
    }

    @Test
    void findMax() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);

        int maxValue = FindMinMax.find(MinMax.Max, numbers);
        assertEquals(5, maxValue);
    }

    @Test
    void sameMinMax() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        int minValue = FindMinMax.find(MinMax.Min, numbers);
        int maxValue = FindMinMax.find(MinMax.Max, numbers);

        assertEquals(1, minValue);
        assertEquals(1, maxValue);
    }

    @Test
    void oneElementInArray() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);

        int minValue = FindMinMax.find(MinMax.Min, numbers);
        int maxValue = FindMinMax.find(MinMax.Max, numbers);

        assertEquals(3, minValue);
        assertEquals(3, maxValue);
    }

    @Test
    void emptyArray() {
        ArrayList<Integer> numbers = new ArrayList<>();

        IllegalArgumentException minThrown = assertThrows(
                IllegalArgumentException.class,
                () -> FindMinMax.find(MinMax.Min, numbers)
        );

        IllegalArgumentException maxThrown = assertThrows(
                IllegalArgumentException.class,
                () -> FindMinMax.find(MinMax.Max, numbers)
        );
    }
}