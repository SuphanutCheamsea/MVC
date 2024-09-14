public class Machine {
    private int id;                 
    private String[] udderStatuses; 

    public Machine(int id) {
        this.id = id;
        this.udderStatuses = new String[4]; 
        for (int i = 0; i < udderStatuses.length; i++) {
            udderStatuses[i] = "Null"; 
        }
    }

    public int getId() {
        return id;
    }

    public String[] getUdderStatuses() {
        return udderStatuses;
    }

    public void setUdderStatus(int udderIndex, String status) {
        if (udderIndex >= 0 && udderIndex < udderStatuses.length) {
            udderStatuses[udderIndex] = status;
        }
    }

    public boolean isAvailable() {
        for (String status : udderStatuses) {
            if (status.equals("Null")) {
                return true;  
            }
        }
        return false; 
    }
}
