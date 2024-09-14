import java.util.Arrays;

public class CowStrikeView {
    
    public void displayCowStatus(Cow cow) {
        System.out.println("Cow ID: " + cow.getId() + ", Gender: " + (cow.isMale() ? "Male" : "Female") 
        + ", Udders: " + cow.getUdders() + ", Preferred Machine: " + cow.getPreferredMachine());
    }

    public void displaySystemStatus(CowStrikeStatus status) {
        System.out.println("Milk Produced: " + status.getTotalMilk() + " liters");
        System.out.println("Interventions: " + status.getInterventionCount());
        System.out.println("Processed Cows: " + status.getProcessedCowCount());
        System.out.println("Removed Problematic Cows: " + status.getRemovedCowCount());
    }
    
    public void displayMachineStatus(Machine machine) {
        System.out.println("Machine " + machine.getId() + " Status: " + Arrays.toString(machine.getUdderStatuses()));
    }
}
