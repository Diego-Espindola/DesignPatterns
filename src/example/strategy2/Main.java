package example.strategy2;

import example.strategy2.state.ApprovedState;
import example.strategy2.state.FailedState;
import example.strategy2.state.PendingState;


public class Main {
    public static void main(String[] args) {
        Inspection inspection = new Inspection(new PendingState());

        // O estado atual é pendente
        inspection.nextState();

        // Alterando o estado para aprovado
        inspection.setState(new ApprovedState());
        inspection.nextState();

        // Alterando o estado para reprovado
        inspection.setState(new FailedState());
        inspection.nextState();
    }
}

