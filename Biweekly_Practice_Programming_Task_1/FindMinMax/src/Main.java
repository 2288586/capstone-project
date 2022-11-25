import java.util.ArrayList;

/* Task: Find Min/Max Value In Given Array Of Integers

Input: Array of integers
Output: Min and/or Max Element

*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);

        int minValue = FindMinMax.find(MinMax.Min, numbers);
        int maxValue = FindMinMax.find(MinMax.Max, numbers);

        System.out.println("Input Array: " + numbers);
        System.out.println("Minimum Value: " + minValue + ", Maximum Value: " + maxValue);
    }
}