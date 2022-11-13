public class Problem10 {
    public static long main(long ceilingNum) {
        long total = 0;
        for (int c = 0; c < ceilingNum; c++) {
            if (primeChecker(c)){
                total += c;
            }
        }
        System.out.println(total);
        return total;
    }

    private static boolean primeChecker(long num) {
        if (num < 2) {return false;} else if (num == 2) {return true;}
        for (int c = 2; c <= Math.pow(num, .5); c++) {
            if (num % c == 0) {
                return false;
            }
        }
        return true;
    }
}
