import javax.swing.*;
import java.awt.event.ActionEvent;

public class p078AnonymousClassEventHandlingInGUISwing {
    public static void main(String[] args){
        JFrame frame = new JFrame("Anonymous Class Example");
        JButton butt = new JButton("Click me");

        butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e){
                System.out.println("Button Clicked");
            }
        });
        frame.add(butt);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
