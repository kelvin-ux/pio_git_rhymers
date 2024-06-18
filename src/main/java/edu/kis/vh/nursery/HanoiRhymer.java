package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

private int totalRejected = 0;


    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int inx) {
    if (!callCheck() && inx > peekaboo())
            totalRejected++;
        else
            super.countIn(inx);
    }
}
