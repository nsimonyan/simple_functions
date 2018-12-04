public class FibonacciSimple {
    static int fibonacci(int n)
    {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int fibonacciSimple(int n){
        if (n ==0) return n;
        int sum=0;
        int a=0,b=1;
        for (int i = 2; i <=n; ++i) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
        }
    public static void main (String args[])
    {
        System.out.println(fibonacci(10));
        System.out.println(fibonacciSimple(10));
    }
}
