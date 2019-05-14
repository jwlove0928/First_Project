package «¡∑Œ¡ß∆Æ;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuPanel {
	
	public menuPanel(){
		
		JPanel p1 = new JPanel();
		
		p1.setSize(471, 432);
		
		FlowLayout flow = new FlowLayout();
		
		p1.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC0C1\uC758");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
		btnNewButton.setBounds(0, 0, 117, 50);
		p1.add(btnNewButton);
		
		JButton button = new JButton("\uD558\uC758");
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("±º∏≤", Font.BOLD, 20));
		button.setBounds(123, 0, 117, 50);
		p1.add(button);
		
		JButton button_1 = new JButton("\uC2E0\uBC1C");
		button_1.setBackground(Color.BLACK);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("±º∏≤", Font.BOLD, 20));
		button_1.setBounds(243, 0, 111, 50);
		p1.add(button_1);
		
		JButton button_2 = new JButton("\uC544\uC6B0\uD130");
		button_2.setBackground(Color.BLACK);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("±º∏≤", Font.BOLD, 20));
		button_2.setBounds(354, 0, 117, 50);
		p1.add(button_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(0, 50, 471, 322);
		p1.add(btnNewButton_1);
		
		
		p1.setVisible(true);
		
	}
}	
