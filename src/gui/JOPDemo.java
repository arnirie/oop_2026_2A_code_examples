package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOPDemo {

    static void main() {
        JFrame lframe = new ComponentsFrame();
        lframe.setVisible(true);
//        JFrame frame = new JFrame("Student Information System");
//        frame.setSize(500, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //borderlayout -> 5 regions NEWS + center
//        frame.setLayout(new BorderLayout());
//        JPanel header = new JPanel(); //layout manager -> flowlayout
//        header.add(new JLabel("Student Information System :: Login"));
//        JPanel mainPanel = new JPanel(new GridLayout(3,2, 10, 10));
//        mainPanel.add(new JLabel("Username: "));
//        JTextField tfUserName = new JTextField();
//        mainPanel.add(tfUserName);
//        mainPanel.add(new JLabel("Student ID:"));
//        mainPanel.add(new JTextField(20));
//        mainPanel.add(new JLabel("Password:"));
//        mainPanel.add(new JPasswordField());
//        JPanel footer = new JPanel();
//        JButton btnLogin = new JButton("Login");
//        btnLogin.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                String username = tfUserName.getText();
//                JOptionPane.showMessageDialog(btnLogin, tfUserName.getText() + "\n" + "student id");
//            }
//        });
//        footer.add(btnLogin);
//        JButton resetBtn = new JButton("Reset");
//        resetBtn.addActionListener(_ -> {
//            //code
//            tfUserName.setText("");
//        } );
//        footer.add(resetBtn);
//        frame.add(header, BorderLayout.NORTH);
//        frame.add(mainPanel, BorderLayout.CENTER);
//        frame.add(footer, BorderLayout.SOUTH);
//        frame.pack();
//        frame.setVisible(true);
        //JOptionPane
//        JOptionPane.showMessageDialog(null, "Hi to everyone!");
//        JOptionPane.showMessageDialog(null, "Hello again", "OOP", JOptionPane.QUESTION_MESSAGE);
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Your name is " + name);
        //using JOP, ask the user to enter a number and display its factorial
        //int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
//        String response = JOptionPane.showInputDialog(null, "Enter something", "Input", JOptionPane.QUESTION_MESSAGE);
//        if(response == null){
//            IO.println("user cancelled");
//        } else IO.println(response);
//        int response = JOptionPane.showConfirmDialog(null, "Just Confirm");
//        int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm",
//                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//        IO.println(response);
//        if(response == JOptionPane.YES_OPTION){
//            IO.println("User pressed Yes");
//        } else if(response == JOptionPane.NO_OPTION){
//            IO.println("User pressed NO");
//        }
        //using JOP, ask the user for a name and display the name in reversed order
        //input: arni; output: inra
//        String sample = "test";
//        StringBuilder sb = new StringBuilder(sample);
//        IO.println(sb.reverse());
    }

}
