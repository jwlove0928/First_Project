package ������Ʈ;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jframePay3 extends JFrame {
	
	private JTextField textField;
	private JTextField textField_1;
	
	public jframePay3() {
		
		
//		String realname = jpanelshirt.name;
//		String realprice = jpanelshirt.price;
//		ImageIcon realimage = jpanelshirt.image;
		
		menuDAO dao = new menuDAO();
		int getnumber = jpanelouter.number;
		menuDTO	dto = dao.getnumber(getnumber);
		String pname = dto.getPname();
		String price = dto.getPrice();
		String image = dto.getImage();
		
		
		
//		pic[1] = dto1.getImage();
//		pic[2] = dto2.getImage();
//		pic[3] = dto3.getImage();
//		pic[4] = dto4.getImage();
		
		ImageIcon icon1 = new ImageIcon(image);
		
		
		setSize(500, 500);
		getContentPane().setLayout(null);
		JLabel lb1 = new JLabel("\uC8FC\uBB38\uD558\uAE30");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("����", Font.BOLD, 30));
		lb1.setBounds(12, 23, 460, 43);
		getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("");
		lb2.setBounds(36, 104, 150, 75);
		lb2.setIcon(icon1);
		getContentPane().add(lb2);
		
		textField = new JTextField();
		textField.setBounds(198, 101, 241, 34);
		textField.setText(pname);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setText(price);
		textField_1.setBounds(198, 145, 241, 34);
		getContentPane().add(textField_1);
		
		JButton b2 = new JButton("\uD655\uC815"); //Ȯ����ư
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dto.setPname(pname);
				dto.setPrice(price);
//				dto.setUser(user);
				
				dao.insert(dto);
				dispose();
			}
		});
		b2.setFont(new Font("����", Font.BOLD, 20));
		b2.setBounds(181, 372, 97, 34);
		getContentPane().add(b2);
		
		
		setVisible(true);
		
	}

}
