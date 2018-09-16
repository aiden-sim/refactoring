package chapter10.preserverWholeObject.before;

public class Room {
    boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRnage().getLow();
        int high = daysTempRnage().getHigh();
        return plan.withinRange(low, high);
    }

    private TempRange daysTempRnage() {
        return new TempRange();
    }
}
