package Swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;        

public class HelloSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JButton btn1 = new JButton("Klick mich");
        frame.getContentPane().add(btn1);
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btn1.setText("wurde geklickt");
        	}
        });
        
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}