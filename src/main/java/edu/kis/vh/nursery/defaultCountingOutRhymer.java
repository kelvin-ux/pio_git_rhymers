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
            NUMBERS[setTotal(getTotal() + 1)] = in;
    }

    public boolean callCheck() {
        return getTotal() == TOTAL;
    }
    public boolean isFull() {
        return getTotal() == 11;
    }

    public static int getTOTAL() {
        return TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[setTotal(getTotal() - 1)];
    }

    public int setTotal(int total) {
        this.total = total;
        return total;
    }
}
