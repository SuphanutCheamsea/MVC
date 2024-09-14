public class Cow {
    private int id;
    private boolean isMale;    
    private int udders;
    private int preferredMachine;
    private boolean isAnnoyed;
    private double milkProduced;

    public Cow(int id, boolean isMale, int udders, int preferredMachine) {
        this.id = id;
        this.isMale = isMale;    
        this.udders = udders;
        this.preferredMachine = preferredMachine;
        this.isAnnoyed = false;
        this.milkProduced = 0.0;
    }

    public boolean isMale() {
        return isMale;  
    }

    public int getId() {
        return id;
    }

    public int getUdders() {
        return udders;
    }

    public int getPreferredMachine() {
        return preferredMachine;
    }

    public double getMilkProduced() {
        return milkProduced;
    }

    public boolean isAnnoyed() {
        return isAnnoyed;
    }

    public void setAnnoyed(boolean isAnnoyed) {
        this.isAnnoyed = isAnnoyed;
    }

    public void produceMilk(double amount) {
        this.milkProduced += amount;
    }
}
