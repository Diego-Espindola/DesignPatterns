package example.strategy2.state;

import example.strategy2.InspectionState;

public class PendingState implements InspectionState {
    @Override
    public void handleState() {
        System.out.println("A vistoria está PENDENTE. Aguardando a finalização de procedimentos.");
    }
}
