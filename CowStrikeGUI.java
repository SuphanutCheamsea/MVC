import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CowStrikeGUI extends JFrame {
    private JTextField cowIdField;
    private JComboBox<String> genderComboBox;
    private JTextField uddersField;
    private JTextField targetMachineField;
    private JTextArea outputArea;
    private ArrayList<Cow> cowList;
    private CowStrikeController controller;

    public CowStrikeGUI() {
        setTitle("Cow Strike Program");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        inputPanel.add(new JLabel("Cow ID:"));
        cowIdField = new JTextField();
        inputPanel.add(cowIdField);

        inputPanel.add(new JLabel("Gender:"));
        String[] genders = {"Female", "Male"};
        genderComboBox = new JComboBox<>(genders);
        inputPanel.add(genderComboBox);

        inputPanel.add(new JLabel("Number of Udders:"));
        uddersField = new JTextField();
        inputPanel.add(uddersField);

        inputPanel.add(new JLabel("Target Machine:"));
        targetMachineField = new JTextField();
        inputPanel.add(targetMachineField);

        JButton addButton = new JButton("Add Cow");
        inputPanel.add(addButton);

        JButton startButton = new JButton("Start Program");
        inputPanel.add(startButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        cowList = new ArrayList<>();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCow();
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controller != null) {
                    controller.processCowQueue();
                    updateOutput();
                }
            }
        });
    }

    private void addCow() {
        try {
            int cowId = Integer.parseInt(cowIdField.getText());
            String gender = (String) genderComboBox.getSelectedItem();
            int udders = Integer.parseInt(uddersField.getText());
            int targetMachine = Integer.parseInt(targetMachineField.getText());

            Cow newCow = new Cow(cowId, gender.equals("Female"), udders, targetMachine);
            cowList.add(newCow);
            outputArea.append("Cow ID: " + cowId + " added successfully.\n");
        } catch (NumberFormatException ex) {
            outputArea.append("Invalid input, please check your values.\n");
        }
    }

    private void updateOutput() {
        outputArea.append("Processing cows...\n");
    }

    public List<Cow> getCowQueue() {
        return cowList;
    }

    public void setController(CowStrikeController controller) {
        this.controller = controller;
    }
    public void displaySystemStatus(CowStrikeStatus status) {
        outputArea.append("Total Milk Produced: " + status.getTotalMilk() + " liters\n");
        outputArea.append("Number of Cows Processed: " + status.getProcessedCowCount() + "\n");
        outputArea.append("Number of Interventions: " + status.getInterventionCount() + "\n");
        outputArea.append("Number of Cows Removed: " + status.getRemovedCowCount() + "\n");
    }
    

    public void displayMachineStatus(Machine machine) {
        outputArea.append("Machine ID: " + machine.getId() + "\n");
        outputArea.append("Udder Statuses: " + Arrays.toString(machine.getUdderStatuses()) + "\n");
    }
}
