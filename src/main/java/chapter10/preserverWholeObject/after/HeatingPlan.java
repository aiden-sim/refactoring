package chapter10.preserverWholeObject.after;

public class HeatingPlan {
    private TempRange _range = new TempRange();

    boolean withinRange(TempRange roomRange) {
        return (_range.includes(roomRange));
    }
}
