import java.util.Arrays;
import java.util.stream.IntStream;

public class Median {
    private static double median(int[] numbers){
        int size=numbers.length;
        IntStream intStream = Arrays.stream(numbers).sorted();
       return intStream.skip((size-1)/2).limit(2-size%2).average().orElse(Double.NaN);
    }
    private static double simpleMedian(int[] numbers){
        Arrays.sort(numbers);
        double median;
        int size=numbers.length;
        int halfSize=size/2;
        if (size % 2 == 0)median = ((double)numbers[halfSize] + (double)numbers[halfSize - 1])/2;
        else median = (double) numbers[halfSize];
        return median;
    }

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5 ,16 ,7 ,8 ,9, 10, 24, 12, 13 ,14 ,15 ,22 ,17 ,18 ,19, 20};
        System.out.println(median(numbers));
        System.out.println(simpleMedian(numbers));
    }
}
