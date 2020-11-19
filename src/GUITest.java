import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {

	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;

	public static void main(String[] args) {
		// all program sequential till now, they had an end
		JFrame frame = new JFrame("Dark wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		JButton b1 = new JButton("Man who stares");
		JButton b2 = new JButton("at goats");
		JButton b502 = new JButton("at code monkeys");
		JButton doNotPushMe = new JButton(
				" my finger is on the button");
		//anonymous class
		b1.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(" Stop staring!! ");
			}
		});
		
		
		
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b502);
		frame.add(doNotPushMe);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
	}

}
