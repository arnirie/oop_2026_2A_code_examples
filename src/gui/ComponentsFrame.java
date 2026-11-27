package gui;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class ComponentsFrame extends  JFrame{
    private JPanel mainPanel;
    private JRadioButton singleRadioButton;
    private JRadioButton marriedRadioButton;
    private JRadioButton widowedRadioButton;
    private JCheckBox permanentCheckBox;
    private JCheckBox primaryCheckBox;
    private JCheckBox secondaryCheckBox;
    private JRadioButton studentRadioButton;
    private JRadioButton seniorCitizenRadioButton;
    private JButton button1;
    private JButton button2;
    private JTextField tfKM;
    private JRadioButton rbRegular;
    private JRadioButton rbStudentSC;
    private JButton btnCompute;
    private JLabel lbDisplay;
    private JComboBox cbFruits;
    private JList listFruits;
    private JButton button3;
    private JSpinner spinner1;
    private JSlider slider1;
    private JProgressBar progressBar1;
    private JTabbedPane tabbedPane1;
    private JTextArea textArea1;
    private JButton button4;
    private JTextArea textArea2;
    private JComboBox comboBox1;
    private JFormattedTextField formattedTextField1;
    private JCheckBox checkBox1;
    private JButton button5;
    private JButton button6;
    private Timer timer;
    private int progressValue;

    public ComponentsFrame() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        progressValue = 0;
        spinner1.setModel(new SpinnerNumberModel(0, -200, 200, 10));
        //formatted text
        try {
            //26-UR-1234 **-??-####
            MaskFormatter phoneMask = new MaskFormatter("**-??@####");
            formattedTextField1.setFormatterFactory(new DefaultFormatterFactory(phoneMask));
        }catch(Exception ex){
            //perform correction
        }
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String selection = "";
                if(singleRadioButton.isSelected())
                    selection = singleRadioButton.getText();
                else if(marriedRadioButton.isSelected())
                    selection = marriedRadioButton.getText();
                else
                    selection = widowedRadioButton.getText();
                JOptionPane.showMessageDialog(button1, selection);
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String choice = "";
                if(permanentCheckBox.isSelected())
                    choice = permanentCheckBox.getText();
                if(primaryCheckBox.isSelected())
                    choice += primaryCheckBox.getText();
                if(secondaryCheckBox.isSelected())
                    choice += secondaryCheckBox.getText();
                JOptionPane.showMessageDialog(button2, choice);
            }
        });
        btnCompute.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //tfKM, rbRegular, rbStudentSC, btnCompute
                //lbDisplay
                int km = Integer.parseInt(tfKM.getText());
                double fare = 12;
                if(km > 4) fare += 3.75 * (km - 4);
                if(rbStudentSC.isSelected()) fare -= fare * 0.2;
                lbDisplay.setText("Computed fare: " + fare);
//                fare += km > 4 ? 3.75 * (km - 4) : 0;
//                fare -= rbStudentSC.isSelected() ? fare * 0.2 : 0;

                //compute fare based on the ff:
                //1st 4km: 12peso
                //next km: 3.75 per km
                //if student/sc: provide 20% discount
                //display label
            }
        });
        timer = new Timer(100, e ->{
            IO.println("timer ticks");
            progressValue++;
            progressBar1.setValue(progressValue);
            if(progressValue >= 100){
                timer.stop();
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                timer.start();
//                spinner1.getValue()
//                JOptionPane.showMessageDialog(button3, slider1.getValue());
//                slider1.setValue(500);
                progressBar1.setValue(60);
                //combo
//                IO.println(cbFruits.getSelectedItem());
                for(Object o : listFruits.getSelectedValuesList()){
                    IO.println(o);
                }
            }
        });
    }
}
