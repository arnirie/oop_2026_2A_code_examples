package gui;

import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame{
    private JPanel mainPanel;
    private JPanel header;
    private JPanel footer;
    private JButton btnLogin;
    private JButton btnReset;
    private JPanel center;
    private JTextField tfStudentID;
    private JTextField tfUsername;
    private JPasswordField tfPassword;

    public LoginFrame(){
        this.setTitle("SIS :: Login");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(400, 300);
       this.setLocationRelativeTo(null);//center to screen
        this.pack();
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainPanel, tfUsername.getText() + "\n" + tfStudentID.getText() + "\n" + tfPassword.getText());
            }
        });
//        btnReset.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
//                tfUsername.setText("");
//                tfStudentID.setText("");
//                tfPassword.setText("");
//            }
//        });
        btnReset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                IO.println("clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                IO.println("pressed")  ;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                IO.println("released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                IO.println("entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                IO.println("exited");
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });
    }
}
