package gui;

import javax.swing.*;

public class JOPDemo {

    static void main() {
        JFrame frame = new JFrame("My First GUI Program");
        JLabel label = new JLabel("This is my first label");
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        JOptionPane.showMessageDialog(null, "sample");
        frame.setSize(50,50);

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
