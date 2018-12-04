public class PrimeChecker {
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9, 10, 11, 12, 13 ,14 ,15 ,16 ,17 ,18 ,19, 20};
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i] + " is prime = " + isPrime(numbers[i]));
        }
    }
}
