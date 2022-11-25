import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FindTwoMinsTest {

    @Test
    void findTwoMinsOne() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(6);

        FindTwoMinsResult findTwoMinsResult = FindTwoMins.find(numbers);
        assertEquals(3, findTwoMinsResult.valueOne);
        assertEquals(5, findTwoMinsResult.valueTwo);
    }

    @Test
    void findTwoMinsTwo() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(4);

        FindTwoMinsResult findTwoMinsResult = FindTwoMins.find(numbers);
        assertEquals(3, findTwoMinsResult.valueOne);
        assertEquals(4, findTwoMinsResult.valueTwo);
    }

    @Test
    void findTwoMinsThree() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(1);

        FindTwoMinsResult findTwoMinsResult = FindTwoMins.find(numbers);
        assertEquals(1, findTwoMinsResult.valueOne);
        assertEquals(3, findTwoMinsResult.valueTwo);
    }

    @Test
    void findTwoMinsFour() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(3);

        FindTwoMinsResult findTwoMinsResult = FindTwoMins.find(numbers);
        assertEquals(3, findTwoMinsResult.valueOne);
        assertEquals(3, findTwoMinsResult.valueTwo);
    }

    @Test
    void findTwoMinsFive() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(5);

        FindTwoMinsResult findTwoMinsResult = FindTwoMins.find(numbers);
        assertEquals(3, findTwoMinsResult.valueOne);
        assertEquals(5, findTwoMinsResult.valueTwo);
    }

    @Test
    void sameTwoMins() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        FindTwoMinsResult findTwoMinsResult = FindTwoMins.find(numbers);
        assertEquals(1, findTwoMinsResult.valueOne);
        assertEquals(1, findTwoMinsResult.valueTwo);
    }

    @Test
    void twoElementInArray() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);

        FindTwoMinsResult findTwoMinsResult = FindTwoMins.find(numbers);
        assertEquals(3, findTwoMinsResult.valueOne);
        assertEquals(4, findTwoMinsResult.valueTwo);
    }

    @Test
    void emptyArray() {
        ArrayList<Integer> numbers = new ArrayList<>();

        IllegalArgumentException minThrown = assertThrows(
                IllegalArgumentException.class,
                () -> FindTwoMins.find(numbers)
        );
    }
}