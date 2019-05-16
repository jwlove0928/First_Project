package ÇÁ·ÎÁ§Æ®;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jframePay extends JFrame {
	
	private JTextField textField;
	private JTextField textField_1;
	private JFrameMain win;
	
	public jframePay(JFrameMain win) {
		
		this.win = win;
		
		String realname = jpanelOrder.name;
		String realprice = jpanelOrder.price;
		
		
		setSize(500, 500);
		getContentPane().setLayout(null);
		JLabel lb1 = new JLabel("\uC8FC\uBB38\uD558\uAE30");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lb1.setBounds(12, 10, 434, 43);
		getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("New label");
		lb2.setBounds(35, 63, 150, 75);
		getContentPane().add(lb2);
		
		textField = new JTextField();
		textField.setBounds(195, 63, 241, 34);
		textField.setText(realname);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setText(realprice);
		textField_1.setBounds(195, 104, 241, 34);
		getContentPane().add(textField_1);
		
		JButton b1 = new JButton("\uCD94\uAC00"); //Ãß°¡¹öÆ°
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JLabel label = new JLabel();
					getContentPane().add(label);
					TextField text = new TextField();
					getContentPane().add(textField);
			}
		});
		b1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		b1.setBounds(107, 379, 97, 34);
		getContentPane().add(b1);
		
		JButton b2 = new JButton("\uD655\uC815");
		b2.setFont(new Font("±¼¸²", Font.BOLD, 20));
		b2.setBounds(273, 379, 97, 34);
		getContentPane().add(b2);
		
		
		setVisible(true);
		
	}

}
