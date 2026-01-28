package scenario_based.parcelTracker_delivery_chain_management;


class StageNode {
    String stage;
    StageNode next;

    StageNode(String stage) {
        this.stage = stage;
        this.next = null;
    }
}
