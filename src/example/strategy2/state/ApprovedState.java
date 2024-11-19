package example.strategy2.state;

import example.strategy2.InspectionState;


public class ApprovedState implements InspectionState {
    @Override
    public void handleState() {
        System.out.println("A vistoria foi APROVADA. Todos os critérios foram atendidos.");
    }
}
