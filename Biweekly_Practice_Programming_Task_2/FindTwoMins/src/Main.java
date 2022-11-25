import java.util.ArrayList;

/* Task: Find 2 Min Values In Given Array Of Integers

Input: Array of integers
Output: 2 Min Elements

*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);

        FindTwoMinsResult findTwoMinsResult = FindTwoMins.find(numbers);

        System.out.println("Input Array: " + numbers);
        System.out.println("Minimum Values: " + findTwoMinsResult);
    }
}