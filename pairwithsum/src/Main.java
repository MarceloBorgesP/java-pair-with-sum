import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result must be true: " + PairWithSumCalculator.hasPairWithSum(Arrays.asList(1, 2, 3, 4, 5, 6), 8));
        System.out.println("Result must be false: " + PairWithSumCalculator.hasPairWithSum(Arrays.asList(1, 2, 3, 4, 8, 9), 8));

        List<Integer> list = new ArrayList<>(10000000);

        int tenMillion = 10000000;
        for (int i = 0; i <= tenMillion; i++) {
            list.add(i);
        }

        long initial = System.currentTimeMillis();
        System.out.println(PairWithSumCalculator.hasPairWithSum(list, tenMillion + tenMillion - 1));
        long end = System.currentTimeMillis();
        System.out.println("Total time taken to run in milliseconds: " + (end - initial));
    }
}
