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
    private JButton btnDelete;
    private DefaultListModel<String> model;
    protected double[] prices = {5.5, 4.2, 250, 40};
    protected String[] items = {"Pen", "Pencil", "Coupon Bond", "Ink"};
    protected double total = 0;

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

                double cost = qty * prices[itemIndex];
                String item = cboxItems.getSelectedItem().toString().split("-")[0];
//                if(itemIndex == 0) cost = 5.5 * qty;
//                else if(itemIndex == 1) cost = 4.5 * qty;
//                else if(itemIndex == 2) cost = 250 * qty;
//                else if(itemIndex == 3) cost = 40 * qty;
                total += cost;
                lbCost.setText("Total: " + total);
                model.addElement(item + " - " + qty);
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //remove selected item
                String item = listAddedItems.getSelectedValue().toString();
                String product = item.split("-")[0].trim();
                int qty = Integer.parseInt(item.split("-")[1].trim());
                //linear search
                for(int i = 0 ; i < items.length ; i++){
                    IO.print(items[i]);
                    if(items[i].equals(product)){
                        double cost = qty * prices[i];
                        total -= cost;
                        IO.print(cost);
                    }
                }
                lbCost.setText("Total: " + total);
                int idx = listAddedItems.getSelectedIndex();
                if(idx < 0) return;
                model.removeElementAt(idx);

            }
        });
    }
}
