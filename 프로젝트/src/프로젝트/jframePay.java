package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class jframePay extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	
	
	public jframePay() {
		
		
		setSize(500, 500);
		getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("\uC8FC\uBB38\uACB0\uC81C");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("굴림", Font.BOLD, 30));
		lb1.setBounds(25, 10, 434, 43);
		getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("New label");
		lb2.setBounds(0, 63, 150, 75);
		getContentPane().add(lb2);
		
		textField = new JTextField();
		textField.setBounds(162, 63, 241, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 104, 241, 34);
		getContentPane().add(textField_1);
		
		
		setVisible(true);
		
	}
}
