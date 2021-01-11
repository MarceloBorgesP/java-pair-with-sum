import java.util.*;

public class PairWithSumCalculator {

    static boolean hasPairWithSum(List<Integer> list, Integer sum) {
        Set<Integer> expectedPairs = new HashSet<>();

        for (Integer number : list) {
            if (expectedPairs.contains(number)) {
                return true;
            }

            expectedPairs.add(sum - number);
        }

        return false;
    }
    
}



