import javax.swing.*;
import java.util.*;

public class CowStrikeApp_main {
    public static void main(String[] args) {

        CowStrikeGUI gui = new CowStrikeGUI();
        gui.setVisible(true);

        List<Cow> cowQueue = gui.getCowQueue();  
        List<Machine> machines = generateMachines(10);  
        CowStrikeStatus status = new CowStrikeStatus();

        CowStrikeController controller = new CowStrikeController(cowQueue, machines, gui, status);

        gui.setController(controller);
    }

    private static List<Machine> generateMachines(int count) {
        return new ArrayList<>();
    }
}
