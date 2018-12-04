import java.util.*;

public class DoubleArray {

    private static double findMin(double[] values){
        double min = Double.MAX_VALUE;
        for (Double d: values){
            if(d<min){
                min=d;
            }
        }
        return min;
    }
    private static double findMinStream(double[] values){
        return Arrays.stream(values).min().orElse(Double.NaN);

    }

    private static double findMinFromList(List<Double> doubleList){
        return Collections.min(doubleList);
    }

    private static double findMinFromListStream(List<Double> doubleList){
        return doubleList.stream().mapToDouble(i->i.doubleValue()).min().orElse(Double.NaN);

    }

    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        doubles.add(2.0);
        doubles.add(3.0);
        doubles.add(4.0);
        System.out.println(findMinFromList(doubles));
        System.out.println(findMinFromListStream(doubles));
        double[] doublesArray = new double[3];
        doublesArray[0]=2.0;
        doublesArray[1]=3.0;
        doublesArray[2]=4.0;
        System.out.println(findMin(doublesArray));
        System.out.println(findMinStream(doublesArray));

    }
}
