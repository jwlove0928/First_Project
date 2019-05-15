package «¡∑Œ¡ß∆Æ;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jpanelMenu extends JPanel{
	private JTextField textField;
	private JFrameMain win;

	public jpanelMenu(JFrameMain win) {
		this.win = win;
		setSize(500, 500);
		
		setLayout(null);
		
//		JButton[] button = new JButton[4];
//		for (int i = 0; i < button.length; i++) {
//			button[i] = new JButton("πˆ∆∞" + i);
//		}
//		button[0].setBounds(50, 50, 150, 100);
//		add(button[0]);
//		button[1].setBounds(200, 50, 150, 50);
//		add(button[1]);
//		button[2].setBounds(350, 50, 150, 50);
//		add(button[2]);
//		button[3].setBounds(500, 50, 150, 50);
//		add(button[3]);
		
		
		JButton b1 = new JButton(); //ªÛ¿«πˆ∆∞
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("Jpanel02");
			}
		});
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.GREEN);
		b1.setFont(new Font("±º∏≤", Font.BOLD, 25));
		b1.setText("\uC0C1\uC758");
		add(b1);
		b1.setBounds(0, 62, 125, 50);
		
		
		JButton button_1 = new JButton();
		button_1.setBackground(Color.WHITE);
		button_1.setForeground(Color.BLUE);
		button_1.setFont(new Font("±º∏≤", Font.BOLD, 25));
		button_1.setText("\uD558\uC758");
		button_1.setBounds(123, 62, 125, 50);
		add(button_1);
		
		JButton button_2 = new JButton();
		button_2.setBackground(Color.WHITE);
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setFont(new Font("±º∏≤", Font.BOLD, 25));
		button_2.setText("\uC2E0\uBC1C");
		button_2.setBounds(248, 62, 125, 50);
		add(button_2);
		
		JButton button_3 = new JButton();
		button_3.setBackground(Color.WHITE);
		button_3.setForeground(Color.PINK);
		button_3.setFont(new Font("±º∏≤", Font.BOLD, 25));
		button_3.setText("\uC544\uC6B0\uD130");
		button_3.setBounds(375, 62, 125, 50);
		add(button_3);
		
		JLabel label = new JLabel("\uC0C1\uD488\uAC80\uC0C9");
		label.setFont(new Font("±º∏≤", Font.BOLD, 20));
		label.setBounds(12, 23, 93, 29);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(117, 23, 306, 27);
		add(textField);
		textField.setColumns(10);
		
		setVisible(true);
	}
}
