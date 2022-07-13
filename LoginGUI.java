import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginGUI implements ActionListener{
	
	String username = "Marshall";
	String the_pass = "password";
	
	private static JLabel userLabel;
	private static JLabel passLabel;
	private static JTextField userText;
	private static JPasswordField passText;
	private static JButton button;
	private static JLabel success;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		userLabel = new JLabel("Username:");
		passLabel = new JLabel("Password:");
		userText = new JTextField();
		passText = new JPasswordField();
		button = new JButton("Login");
		success = new JLabel("");
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.add(userLabel);
		panel.add(userText);
		panel.add(passLabel);
		panel.add(passText);
		panel.add(button);
		panel.add(success);
		
		userLabel.setBounds(10, 20, 80, 25);
		passLabel.setBounds(10, 50, 80, 25);
		
		userText.setBounds(100, 20, 165, 25);
		passText.setBounds(100, 50, 165, 25);
		
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new LoginGUI());
		
		success.setBounds(10, 110, 300, 25);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passText.getText();	// deprecated but I'd use this for now
		
		if (user.equals(username) && password.equals(the_pass)) {
			success.setText("Login successful.");
		}
		
		else if (user.equals("") && password.equals("")) {
			success.setText("Fields are blank.");
		}
		
		else if (user.equals("")) {
			success.setText("Missing username!");
		}
		
		else if (password.equals("")) {
			success.setText("Missing password!");
		}
		
		else
			success.setText("Credentials do not match.");
	}
	
	
}
