package example.strategy2;


public class Inspection {
    private InspectionState state;

    public Inspection(InspectionState state) {
        this.state = state;
    }

    public void setState(InspectionState state) {
        this.state = state;
    }

    public void nextState() {
        state.handleState();
    }
}
