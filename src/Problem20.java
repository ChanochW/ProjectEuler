import java.math.BigInteger;

public class Problem20 {
    public static Integer main(int n) {
        char[] factorialAmount = nFactorial(n).toCharArray();
        BigInteger sumOfFactorialAmount = new BigInteger("0");
        for (char c : factorialAmount) {
            BigInteger num = new BigInteger(Character.toString(c));
            sumOfFactorialAmount = sumOfFactorialAmount.add(num);
        }
        return Integer.parseInt(sumOfFactorialAmount.toString());}

    public static String nFactorial(int n) {
        String factorialAmount;
        BigInteger factorial = new BigInteger("1");
        for (int c = n; c > 0; c--) {
            BigInteger num = new BigInteger(c + "");
            factorial = factorial.multiply(num);
        }
        factorialAmount = factorial.toString();
        return factorialAmount;
    }
}
