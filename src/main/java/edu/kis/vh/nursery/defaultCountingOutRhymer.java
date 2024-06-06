package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int SIZE = 12;

	private static final int TOTAL = -1;

	private final int [] NUMBERS = new int[SIZE];

    public int getTotal() {
        return total;
    }

    public int total = TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }
    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total--];
    }

}
