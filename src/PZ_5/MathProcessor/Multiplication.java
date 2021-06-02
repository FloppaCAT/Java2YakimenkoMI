package PZ_5.MathProcessor;

public class Multiplication implements MathProcessor {
    @Override
    public int invoke(int first, int second) {
        return first*second;
    }
}
