import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class OsmanyaDetecator {
	
	public static void showMe() {
		JFrame frame = new JFrame("Show me your language");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new GridLayout(3, 3));
		
		
		JLabel label = new JLabel("Show me something!");
		contentPane.add(label);
		
		JTextField textField = new JTextField();
		contentPane.add(textField);
		
		JButton button = new JButton("CHECK");
		button.addActionListener(click -> {
			textField.setText(toHexString(textField.getText()));
		});
		contentPane.add(button);
		
		frame.pack();
		frame.setBounds(50, 50, 200, 200);
		frame.setVisible(true);
	}
	
	public static String toHexString(String input) {
		int codePointCount = input.codePointCount(0, input.length());
		char[] inputs = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		if ( input.length() % codePointCount == 0) {
			
			for (char c : inputs) {
				sb.append("\\u" + Integer.toHexString(c | 0x10000).substring(1));
				sb.append('|');
			}
		}

		if (sb.toString().contains("\\ufffd")) {
			return "Invalid input!!!";
		}
		
		if (sb.toString().contains("\\ud801")) {
			sb.insert(0, "OH!! OSMANYA!!!!");
		}
		
		return sb.toString();
	}
}
