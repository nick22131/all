import javax.swing.*;

public class AnonymouseGUI {
    public static void main(String [] args){
        JFrame frame = new JFrame ("Anonymous class example ");
        JButton button = new JButton("Click me");
        button.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                System.out.print("Button Clicked");
            }
        });
        frame.add(button);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
