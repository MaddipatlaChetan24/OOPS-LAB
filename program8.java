public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 10, end = 50;
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
