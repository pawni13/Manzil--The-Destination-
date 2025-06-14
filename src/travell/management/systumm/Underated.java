package travell.management.systumm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Underated extends JFrame implements Runnable {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    Thread th;

    public void run() {
        try {

            l2.setVisible(true);
            Thread.sleep(2800);
            l2.setVisible(false);
            l3.setVisible(true);
            l3.setVisible(true);
            Thread.sleep(2800);
            l3.setVisible(false);
            l4.setVisible(true);
            Thread.sleep(2800);
            l4.setVisible(false);
            l5.setVisible(true);
            Thread.sleep(2800);
            l5.setVisible(false);
            l6.setVisible(true);
            Thread.sleep(2800);
            l6.setVisible(false);
            l7.setVisible(true);
            Thread.sleep(2800);
           
            
            
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Underated() {

        setBounds(580, 220, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/des1.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/des2.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("images/des3.jpeg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("images/des4.jpeg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("images/des5.jpeg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("images/des6.jpeg"));
        Image i17 = i16.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(0, 0, 900, 700);
        add(l7);
        l7.setVisible(false);

        

       

        th.start();

    }

    public static void main(String args[]) {
        new Underated().setVisible(true);

    }

}
