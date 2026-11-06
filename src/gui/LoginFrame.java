package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        btnReset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfUsername.setText("");
                tfStudentID.setText("");
                tfPassword.setText("");
            }
        });
    }
}
