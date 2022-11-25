import java.util.ArrayList;

public class FindTwoMins {

    public static FindTwoMinsResult find(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException();
        }

        return findOne(numbers);
    }

    private static FindTwoMinsResult findOne(ArrayList<Integer> numbers) {
        int returnValueOne = Math.min(numbers.get(0), numbers.get(1));
        int returnValueTwo = Math.max(numbers.get(0), numbers.get(1));

        for (int i = 2; i < numbers.size(); i++) {
            if (numbers.get(i) < returnValueOne || numbers.get(i) < returnValueTwo) {

                if (numbers.get(i) <= returnValueOne) {
                    returnValueTwo = returnValueOne;
                    returnValueOne = numbers.get(i);

                } else if (numbers.get(i) < returnValueTwo) {
                    returnValueTwo = numbers.get(i);
                }
            }
        }

        FindTwoMinsResult returnValue = new FindTwoMinsResult(returnValueOne, returnValueTwo);
        return returnValue;
    }

    private static FindTwoMinsResult findTwo(ArrayList<Integer> numbers) {
        int returnValueOne = numbers.get(0);
        int returnValueTwo = numbers.get(1);

        for (int i = 2; i < numbers.size(); i++) {
            if (returnValueOne > returnValueTwo) {
                if (numbers.get(i) < returnValueOne) {
                    returnValueOne = numbers.get(i);
                }

            } else {
                if (numbers.get(i) < returnValueTwo) {
                    returnValueTwo = numbers.get(i);
                }
            }
        }

        FindTwoMinsResult returnValue = new FindTwoMinsResult(Math.min(returnValueOne, returnValueTwo), Math.max(returnValueOne, returnValueTwo));
        return returnValue;
    }
}