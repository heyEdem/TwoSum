import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4 ,7,8};
        int target = 7;
        int result [] = getTwoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] getTwoSum(int[] array , int target) {

        Map<Integer, Integer> visitedNumbers = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int delta = target - array[i];

            if (visitedNumbers.containsKey(delta)) {
                return new int[]{visitedNumbers.get(delta), i};
            }

            visitedNumbers.put(array[i], i);
        }
        return new int [] {-1,-1};
    }
}