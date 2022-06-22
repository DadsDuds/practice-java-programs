import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class GUI implements ActionListener{
	
	boolean selected = true;
	private JLabel title;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JLabel thyanswer;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField textfield;

	private ButtonGroup group;
	
	public GUI() {
		
		frame = new JFrame();
		
		title = new JLabel("What conversion type will you be using?");
		rb1 = new JRadioButton("Fahrenheit to Celsius", selected);
		rb2 = new JRadioButton("Celsius to Fahrenheit");
		thyanswer = new JLabel("Your converted temp is: ");
		button = new JButton("Convert");
		button.addActionListener(this);
		
		textfield = new JTextField();
		textfield.setBounds(100, 20, 165, 25);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(0, 1));
		
		panel.add(title);
		panel.add(rb1);
		panel.add(rb2);
		panel.add(textfield);
		panel.add(button);
		panel.add(thyanswer);
			
		group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GUI();
	}

	public void actionPerformed(ActionEvent arg0) {
		if (rb1.isSelected()) {
			try {
				double temp = Double.parseDouble(textfield.getText());
				temp = (temp - 32) * (5.0/9.0);
				thyanswer.setText(Double.toString(temp));
				System.out.println(temp);
			}catch(Exception e) {
				thyanswer.setText("Please enter a valid temperature.");
			}
		}else {
			try {
				double temp = Double.parseDouble(textfield.getText());
				temp = temp * 1.8 + 32;
				thyanswer.setText(Double.toString(temp));
				System.out.println(temp);
			}catch(Exception e) {
				thyanswer.setText("Please enter a valid temperature.");
			}
		}
	
		
	}
}
