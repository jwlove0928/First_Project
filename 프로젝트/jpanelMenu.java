package ÇÁ·ÎÁ§Æ®;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jpanelMenu extends JPanel{
	private JTextField textField;
	private JFrameMain win;
	static int number1;
	static String pname1;
	static String price1;
	static String image1;
	

	public jpanelMenu(JFrameMain win) {
		this.win = win;
		setSize(900, 900);
		
		setLayout(null);
		
		JButton b1 = new JButton(); //»óÀÇ¹öÆ°
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("Jpanel02");
			}
		});
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.GREEN);
		b1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		b1.setText("\uC0C1\uC758");
		add(b1);
		b1.setBounds(286, 132, 125, 50);
		
		
		JButton b2 = new JButton();
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLUE);
		b2.setFont(new Font("±¼¸²", Font.BOLD, 25));
		b2.setText("\uD558\uC758");
		b2.setBounds(444, 132, 125, 50);
		add(b2);
		
		JButton b3 = new JButton();
		b3.setBackground(Color.WHITE);
		b3.setForeground(new Color(0, 0, 0));
		b3.setFont(new Font("±¼¸²", Font.BOLD, 25));
		b3.setText("\uC2E0\uBC1C");
		b3.setBounds(603, 132, 125, 50);
		add(b3);
		
		JButton b4 = new JButton();
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.PINK);
		b4.setFont(new Font("±¼¸²", Font.BOLD, 25));
		b4.setText("\uC544\uC6B0\uD130");
		b4.setBounds(768, 132, 125, 50);
		add(b4);
		
		JLabel label = new JLabel("\uC0C1\uD488\uC785\uB825");
		label.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label.setBounds(321, 81, 90, 29);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(443, 84, 306, 27);
		add(textField);
		textField.setColumns(10);
		
		JButton b5 = new JButton("\uAC80\uC0C9"); //°Ë»ö¹öÆ°
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText();
				menuDAO dao = new menuDAO();
				menuDTO dto = dao.select(input);
				String p1 = dto.getPname();
				String p2 = dto.getPrice();
				String p3 = dto.getImage();
				pname1 = p1;
				price1 = p2;
				image1 = p3;
				
				jpanelSelect select = new jpanelSelect();
			}
		});
		b5.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b5.setBounds(796, 86, 97, 23);
		add(b5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(286, 192, 607, 328);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 1500, 71);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 81, 228, 900);
		add(lblNewLabel_2);
		
		setVisible(true);
	}
}
