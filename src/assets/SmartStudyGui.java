package assets;

import javax.swing.*;

public class SmartStudyGui extends JFrame {
     public SmartStudyGui() {
       super("Smart Study planner ");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(1280, 720);
       setLocationRelativeTo(null);
       setLayout(null);
       setResizable(false);

       addGuiComponents();
     }

     private void addGuiComponents() {
       

       JButton addTaskButton = new JButton("Add Task");
       addTaskButton.setBounds(50, 100, 150, 30);
       add(addTaskButton);

       JButton viewTasksButton = new JButton("View Tasks");
       viewTasksButton.setBounds(250, 100, 150, 30);
       add(viewTasksButton);

       JButton exitButton = new JButton("Exit");
       exitButton.setBounds(450, 100, 100, 30);
       exitButton.addActionListener(e -> System.exit(0));
       add(exitButton);
     }
    }
