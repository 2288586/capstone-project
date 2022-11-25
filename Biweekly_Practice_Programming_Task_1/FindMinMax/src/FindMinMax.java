import java.util.ArrayList;

public class FindMinMax {
    public static int find(MinMax minMax, ArrayList<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int returnValue = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (minMax == MinMax.Min && numbers.get(i) < returnValue) {
                returnValue = numbers.get(i);
            }

            if (minMax == MinMax.Max && numbers.get(i) > returnValue) {
                returnValue = numbers.get(i);
            }
        }

        return returnValue;
    }
}