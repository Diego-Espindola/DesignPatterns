package example.strategy2.state;

import example.strategy2.InspectionState;

public class FailedState implements InspectionState {
    @Override
    public void handleState() {
        System.out.println("A vistoria foi REPROVADA. Verifique os critérios não atendidos e reenvie.");
    }
}
