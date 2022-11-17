public class Problem14 {

    public static long main(long max) {
        return(longestSequenceNumber(max));
    }

    private static long longestSequenceNumber(long maxNum) {
        long sequenceLength, currentVal, finalSequenceLength = 0, finalSequenceLengthAmount = 0;
        for (long c = 2; c < maxNum; c++) {
            currentVal = c;
            sequenceLength = 1;
            while (currentVal > 1) {
                if (currentVal % 2 == 0) {
                    currentVal = currentVal / 2;
                } else {
                    currentVal = 3 * currentVal + 1;
                }
                sequenceLength += 1;
            }
            if (sequenceLength > finalSequenceLength) {
                finalSequenceLength = sequenceLength;
                finalSequenceLengthAmount = c;
            }
        }

        return finalSequenceLengthAmount;
    }
}
