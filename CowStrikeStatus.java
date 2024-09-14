public class CowStrikeStatus {
    private double totalMilk;          
    private int interventionCount;  
    private int processedCowCount;     
    private int removedCowCount;        

    public CowStrikeStatus() {
        this.totalMilk = 0.0;
        this.interventionCount = 0;
        this.processedCowCount = 0;
        this.removedCowCount = 0;
    }
    public double getTotalMilk() {
        return totalMilk;
    }

    public void addMilk(double milk) {
        this.totalMilk += milk;
    }

    public int getInterventionCount() {
        return interventionCount;
    }

    public void incrementInterventionCount() {
        this.interventionCount++;
    }

    public int getProcessedCowCount() {
        return processedCowCount;
    }

    public void incrementProcessedCowCount() {
        this.processedCowCount++;
    }

    public int getRemovedCowCount() {
        return removedCowCount;
    }

    public void removeCow(Cow cow) {
        this.removedCowCount++;
    }
}
