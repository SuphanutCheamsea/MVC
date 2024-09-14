import java.util.List;

public class CowStrikeController {
    private List<Cow> cowQueue;
    private List<Machine> machines;
    private CowStrikeGUI view;  
    private CowStrikeStatus status;

    public CowStrikeController(List<Cow> cowQueue, List<Machine> machines, CowStrikeGUI view, CowStrikeStatus status) {
        this.cowQueue = cowQueue;
        this.machines = machines;
        this.view = view;  
        this.status = status;
    }

    public void processCowQueue() {
        for (Cow cow : cowQueue) {
            if (cow.isMale() || cow.getUdders() != 4) {
                System.out.println("Intervention needed: Removing problematic cow");
                status.incrementInterventionCount();
                status.removeCow(cow);
            } else {
                assignToMachine(cow);
            }
        }
    }

    private void assignToMachine(Cow cow) {
        for (Machine machine : machines) {
        }
    }
    
    public void updateView() {
        view.displaySystemStatus(status);
        for (Machine machine : machines) {
            view.displayMachineStatus(machine);
        }
    }
}
