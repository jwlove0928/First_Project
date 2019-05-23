package ÇÁ·ÎÁ§Æ®;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class jpanelMenu extends JPanel{
	private JTextField textField;
	private JFrameMain win;
	static String pname1;
	static String price1;
	static String image1;

	private JTextField Loginid;
	private JTextField Loginpw;
	

	public jpanelMenu(JFrameMain win) {
		this.win = win;
		setSize(900, 900);
		
		setLayout(null);
		
		JButton b1 = new JButton(); //»óÀÇ¹öÆ°
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("jpanelshirt");
			}
		});
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.GREEN);
		b1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		b1.setText("\uC0C1\uC758");
		add(b1);
		b1.setBounds(281, 151, 125, 50);
		
		
		JButton b2 = new JButton(); //ÇÏÀÇ¹öÆ°
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("jpanelpants");
			}
		});
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLUE);
		b2.setFont(new Font("±¼¸²", Font.BOLD, 25));
		b2.setText("\uD558\uC758");
		b2.setBounds(439, 151, 125, 50);
		add(b2);
		
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("jpanelshose");
			}
		});
		b3.setBackground(Color.WHITE);
		b3.setForeground(new Color(0, 0, 0));
		b3.setFont(new Font("±¼¸²", Font.BOLD, 25));
		b3.setText("\uC2E0\uBC1C");
		b3.setBounds(598, 151, 125, 50);
		add(b3);
		
		JButton b4 = new JButton();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("jpanelouter");
			}
		});
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.PINK);
		b4.setFont(new Font("±¼¸²", Font.BOLD, 25));
		b4.setText("\uC544\uC6B0\uD130");
		b4.setBounds(763, 151, 125, 50);
		add(b4);
		
		JLabel label = new JLabel("\uC0C1\uD488\uC785\uB825");
		label.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label.setBounds(316, 100, 90, 29);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(438, 103, 306, 27);
		add(textField);
		textField.setColumns(10);
		
		JButton b5 = new JButton("\uAC80\uC0C9"); //°Ë»ö¹öÆ°
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText();
				menuDAO dao = new menuDAO();
				ArrayList select = dao.selectlist(input);
				menuDTO dto = (menuDTO)select.get(0);
				String pname = dto.getPname();
				String price = dto.getPrice();
				String image = dto.getImage();
				System.out.println(image);
				pname1 = pname;
				price1 = price;
				image1 = image;
				
				jpanelSelect selectresult = new jpanelSelect();
			}
		});
		b5.setFont(new Font("±¼¸²", Font.BOLD, 15));
		b5.setBounds(791, 105, 97, 23);
		add(b5);
		
		JLabel eventlabel = new JLabel("New label");
		eventlabel.setBounds(281, 211, 607, 328);
		add(eventlabel);
		
		JLabel toplabel = new JLabel("");
		toplabel.setBounds(0, 0, 900, 71);
		ImageIcon icon = new ImageIcon("1.png");
		add(toplabel);
		toplabel.setIcon(icon);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 100, 246, 900);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_2.setBounds(12, 117, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		label_1.setBounds(12, 160, 72, 15);
		panel.add(label_1);
		
		Loginid = new JTextField();
		Loginid.setBounds(96, 114, 116, 21);
		panel.add(Loginid);
		Loginid.setColumns(10);
		
		Loginpw = new JTextField();
		Loginpw.setColumns(10);
		Loginpw.setBounds(96, 157, 116, 21);
		panel.add(Loginpw);
		
		JButton Loginbutton = new JButton("\uB85C\uADF8\uC778");
		Loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MemberDAO dao = new MemberDAO();
				
				String id = Loginid.getText();
				String pw = Loginpw.getText();
				
				MemberDTO dto = dao.select(Loginid.getText());
				if(id.equals(dto.getId()) && pw.equals(dto.getPw())) {
					
				}else {
					JOptionPane.showMessageDialog(null, "¾ÆÀÌµð°¡ Æ²·È½À´Ï´Ù.");
				}
				
			}
		});
		Loginbutton.setFont(new Font("±¼¸²", Font.BOLD, 15));
		Loginbutton.setBounds(12, 215, 97, 23);
		panel.add(Loginbutton);
		
		JButton Insertbutton = new JButton("\uD68C\uC6D0\uAC00\uC785"); //È¸¿ø°¡ÀÔ ¹öÆ°
		Insertbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Memberinsert insert = new Memberinsert();
			}
		});
		Insertbutton.setFont(new Font("±¼¸²", Font.BOLD, 15));
		Insertbutton.setBounds(121, 215, 97, 23);
		panel.add(Insertbutton);
		
		JButton button = new JButton("\uC8FC\uBB38\uC870\uD68C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jframeorserch serch = new jframeorserch();
			}
		});
		button.setBounds(12, 302, 97, 23);
		panel.add(button);
		
		setVisible(true);
	}
}
