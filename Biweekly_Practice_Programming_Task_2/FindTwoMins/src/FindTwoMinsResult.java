public class FindTwoMinsResult {
    protected int valueOne;
    protected int valueTwo;

    public FindTwoMinsResult(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Override
    public String toString() {
        return valueOne + ", " + valueTwo;
    }
}