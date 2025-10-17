import java.math.BigInteger;

public class Main {
    // 计算阶乘
    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // 计算组合数 C(n, k)
    public static BigInteger combination(int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }

    // 计算二项分布概率
    public static double binomialProbability(int n, int k, double p) {
        BigInteger c = combination(n, k);
        return c.doubleValue() * Math.pow(p, k) * Math.pow(1 - p, n - k);
    }

    public static void main(String[] args) {
        int n = 50; // 试验次数
        int k = 33;  // 成功次数
        double p = 0.75; // 每次试验成功的概率

        double probability = binomialProbability(n, k, p);
        System.out.printf("在 %d 次试验中成功 %d 次的概率是: %.6f%n", n, k, probability);
    }
}