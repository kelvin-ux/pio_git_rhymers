package edu.kis.vh.nursery;

/**
 * The defaultCountingOutRhymer class provides a basic implementation of a counting out rhymer.
 */
public class defaultCountingOutRhymer {
    private static final int MAX_SIZE = 12;
    private static final int RETURN = -1;
    private static final int EMPTY = -1;
    private static final int FULL_TOTAL = MAX_SIZE - 1;
    private final int[] NUMBERS = new int[MAX_SIZE];

    /**
     * The total number of elements in the rhymer.
     */
    public int total = EMPTY;

    /**
     * Inserts a number into the rhymer.
     * @param in the number to be inserted
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Gets the total number of elements in the rhymer.
     * @return the total number of elements
     */
    public int getTotal() {
        return total;
    }

    /**
     * Checks if the rhymer is empty.
     * @return true if the rhymer is empty, false otherwise
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Checks if the rhymer is full.
     * @return true if the rhymer is full, false otherwise
     */
    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    /**
     * Returns the last element inserted into the rhymer without removing it.
     * @return the last element inserted, or -1 if the rhymer is empty
     */
    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total];
    }

    /**
     * Removes and returns the last element inserted into the rhymer.
     * @return the last element inserted, or -1 if the rhymer is empty
     */
    public int countOut() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total--];
    }

    /**
     * Gets the maximum number of elements that can be stored in the rhymer.
     * @return the maximum number of elements
     */
    public static int getFullTotal() {
        return FULL_TOTAL;
    }

    // TODO: Consider renaming class to DefaultCountingOutRhymer to follow Java naming conventions
    // TODO: Consider making NUMBERS and total private and providing access via getter methods
    // TODO: Evaluate if NUMBERS array could be dynamically resized instead of being a fixed size
}