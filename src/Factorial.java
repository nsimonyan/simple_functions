public class Factorial {

    static int factorial(int n)
    {
        if (n == 0) return 1;
        return n*factorial(n-1);
    }

    static int factorialSimple(int n)
    {
        int res = 1;
        for (int i=2; i<=n; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of "+ num + " is " + factorial(5));
        System.out.println("Factorial of "+ num + " is " + factorialSimple(5));
    }
}
