package chapter10.preserverWholeObject.after;

public class Room {
    boolean withinPlan(HeatingPlan plan) {
        return plan.withinRange(daysTempRnage());
    }

    private TempRange daysTempRnage() {
        return new TempRange();
    }
}
