 //Using matrix exponentiation
 public class fibonacchi{
static int mod = (int) 1e9 + 7;

 

    public static int fibonacciNumber(int n) {

        long[][] F = {{1, 1}, {1, 0}};

        if (n == 0)

            return 0;

        power(F, n - 1);

 

        return (int) (F[0][0] % mod);

    }

 

    public static void power(long[][] F, int n) {

        if (n == 0 || n == 1)

            return;

        long[][] M = {{1, 1}, {1, 0}};

 

        power(F, n / 2);

        multiply(F, F);

 

        if (n % 2 != 0)

            multiply(F, M);

    }

 

    public static void multiply(long[][] F, long[][] M) {

        long x = (F[0][0] * M[0][0]) % mod + (F[0][1] * M[1][0]) % mod;

        long y = (F[0][0] * M[0][1]) % mod + (F[0][1] * M[1][1]) % mod;

        long z = (F[1][0] * M[0][0]) % mod + (F[1][1] * M[1][0]) % mod;

        long w = (F[1][0] * M[0][1]) % mod + (F[1][1] * M[1][1]) % mod;

 

        F[0][0] = x % mod;

        F[0][1] = y % mod;

        F[1][0] = z % mod;

        F[1][1] = w % mod;

    }         

 

    public static void main(String[] args) {

        int n = 100; // Example value for N

        int fibonacci = fibonacciNumber(n);

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci);

    }
    }

