import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {
    private  static Map<Integer, Integer> calculatedValues = new HashMap<>();
    static {
        calculatedValues.put(0,0);
        calculatedValues.put(1,1);
    }
    public static Integer fibonacci(Integer n){
        if(calculatedValues.containsKey(n)) return calculatedValues.get(n);
        calculate(n);
        return calculatedValues.get(n);
    }

    private static void calculate(Integer n){
        for (int i=2;i<=n;i++){
            calculatedValues.put(i, calculatedValues.get(i-1) + calculatedValues.get(i-2));
        }
    }
    public static void main (String args[])
    {
        System.out.println(fibonacci(10));

    }
}
