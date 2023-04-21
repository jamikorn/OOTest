package labgui;


import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGui implements ActionListener {


    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton exitButton;


        //1. constructor
    public FirstGui(){

            //2. create JFrame
            frame = new JFrame();

            //3. create a label
            label = new JLabel();
            label.setText("First GUI");
            label.setForeground(Color.BLUE);

            //4. create a button
            exitButton = new JButton();
            exitButton.setText("Exit");

            //  exitButton.addActionListener(this);
        //register button to the ActionListener
        exitButton.addActionListener(this);


        //5. create JPanel as container
            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(100, 100,100,100));
            panel.setLayout(new GridLayout(2,1));

            //6. add component to Jpanel
            panel.add(label);
            panel.add(exitButton);

            //7. add JPanel to JFrame and setup JFrame
            frame.add(panel, BorderLayout.CENTER);

            //add JDatePicker
        UtilDateModel model = new UtilDateModel();
    //    JDatePanelImpl datePanel = new JDatePanelImpl(model);
    //    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
      //  frame.add(datePicker);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("My First GUI Application");
            frame.pack();
            frame.setVisible(true);

        }
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }



    public static void main(String[] args) {
            new FirstGui();

    }
}
