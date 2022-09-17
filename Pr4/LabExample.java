package Pr4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LabExample extends JFrame
{
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");
    JPanel[] pnl = new JPanel[12];
    int i1 = 0, i2 = 0;

    public LabExample ()
    {
        super("Football Match");
        setBounds(100, 100, 350, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        int r = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        container.setBackground(new Color(r,g,b));
        button1.setForeground(Color.BLUE);
        button2.setForeground(Color.BLUE);
        button1.setBounds(180,25,120,30);
        button2.setBounds(180,75,120,30);
        label1.setBounds(20, 20, 100, 30);
        label2.setBounds(20, 50, 150, 30);
        label3.setBounds(20, 80, 150, 30);
        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(button1);
        container.add(button2);

        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                i1 += 1;
                String txt1 = "Result: " + i1 + " x " + i2;
                String txt2 = "Last Scorer: AC Milan";
                String txt3 = "Winner: AC Milan";
                String txt4 = "Winner: DRAW";
                label1.setText(txt1);
                label2.setText(txt2);
                if(i1 > i2)
                    label3.setText(txt3);
                else if (i1 == i2) label3.setText(txt4);
            }
        });
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                i2 += 1;
                String txt1 = "Result: " + i1 + " x " + i2;
                String txt2 = "Last Scorer: Real Madrid";
                String txt3 = "Winner: Real Madrid";
                String txt4 = "Winner: DRAW";
                label1.setText(txt1);
                label2.setText(txt2);
                if(i2 > i1)
                    label3.setText(txt3);
                else if (i1 == i2) label3.setText(txt4);
            }
        });
    }

    public static void main(String[]args)
    {
        new LabExample().setVisible(true);
    }
}

