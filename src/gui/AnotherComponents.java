package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherComponents extends JFrame {
    private JPanel mainPanel;
    private JComboBox cboxItems;
    private JTextField tfQty;
    private JButton btnCompute;
    private JLabel lbCost;
    private JList listAddedItems;
    private DefaultListModel<String> model;

    public AnotherComponents(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        model = new DefaultListModel<>();
        listAddedItems.setModel(model);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemIndex = cboxItems.getSelectedIndex();
                int qty = Integer.parseInt(tfQty.getText());
                double[] prices = {5.5, 4.2, 250, 40};
                double cost = qty * prices[itemIndex];
                String item = cboxItems.getSelectedItem().toString().split("-")[0];
//                if(itemIndex == 0) cost = 5.5 * qty;
//                else if(itemIndex == 1) cost = 4.5 * qty;
//                else if(itemIndex == 2) cost = 250 * qty;
//                else if(itemIndex == 3) cost = 40 * qty;
                lbCost.setText("Cost: " + cost);
                model.addElement(item + " - " + qty);
            }
        });
    }
}
