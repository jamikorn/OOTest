package labgui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FrameGui {
    public static void main(String[] args) {


/*
        JFrame frame = new JFrame();
        frame.setTitle("My first GUI application.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(200,100,50));

*/
        JLabel label1 = new JLabel("Hello World!");
        label1.setBackground(Color.ORANGE);
        label1.setForeground(Color.GRAY);
        label1.setFont(new Font("Serif", Font.ITALIC, 36));

        JButton button1 = new JButton("Button1");
        button1.setText("CLICK");

        JLabel label2 = new JLabel("Label2");
        JButton button2 = new JButton("Button2");

        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");

        JFrame frame = new JFrame();
        frame.setTitle("Java Swing Gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    frame.setResizable(false);
        frame.setSize(500,500);

 //       frame.setLayout(new GridLayout(3,5));

        /*
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(label1);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
*/

        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.PINK);
        pinkPanel.setBounds(0,0,100,100);
        pinkPanel.add(button3);
        pinkPanel.add(button4);


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.add(button1);


        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(label1, BorderLayout.NORTH);
        frame.getContentPane().add(label2, BorderLayout.EAST);
    //    frame.getContentPane().add(button1, BorderLayout.SOUTH);
        frame.getContentPane().add(button2, BorderLayout.WEST);
     //   frame.getContentPane().add(button3, BorderLayout.CENTER);
     //   frame.getContentPane().add(button4, BorderLayout.CENTER);
        frame.getContentPane().add(pinkPanel, BorderLayout.CENTER);
        frame.getContentPane().add(bluePanel, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(100,255,50));

    }
}

