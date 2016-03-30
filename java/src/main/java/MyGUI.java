import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {
	
	public MyGUI() {
		super("The Skywalker Family");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Click me!");
		theButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clickity click click");
			}
		});

		JButton button2 = new JButton("Fun times");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Yes definitely mroe fun button");
			}
		});

		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.add(theButton);
		panel.add(button2);

		this.add(panel);

		this.pack();
		this.setVisible(true);		
	}
	
	public static void main(String[] args) {
    	new MyGUI(); //create the frame
	}
}
