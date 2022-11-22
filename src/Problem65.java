import java.math.BigInteger;

public class Problem65 {

    public static int main(int convergent) {
        System.out.println(compute(convergent));
        return compute(convergent);
    }


    public static int compute(int convergent) {
        //set starting numerator
        BigInteger numer = new BigInteger("1");
        //set starting denominator
        BigInteger denom = new BigInteger("0");
        //calculate all the fractions from the convergent till the beginning
        for (int c = convergent - 1; c >= 0; c--) {
            BigInteger num = BigInteger.valueOf(nextFractionNum(c)).multiply(numer).add(denom);
            denom = numer;
            numer = num;
        }
        //summing up numerator
        return getSum(numer);
    }

    private static int getSum(BigInteger numer) {
        char[] nums = numer.toString().toCharArray();
        int sum = 0;
        for (char num : nums) {
            sum += Character.getNumericValue(num);
        }
        return sum;
    }

    private static int nextFractionNum(int position) {
        //first number in the pattern
        if (position == 0) {
            return 2;
        }
        //multiples of 3 (all of these numbers are some 2k)
        else if (position % 3 == 2) {
            //integer division
            return position / 3 * 2 + 2;
        }
        //every other number in the pattern is a one
        else {
            return 1;
        }
    }
}
