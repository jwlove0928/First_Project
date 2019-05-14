package 프로젝트;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class shirtMenu extends JFrame{
	
	
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	
	private static JButton b1;
	private static JButton b2;
	private static JButton b3;
	private static JButton b4;
	private static JButton b5;
	
	public shirtMenu() {
			
	ArrayList list = new ArrayList();
	list.add("c1.jpg");
	list.add("c2.jpg");
	list.add("c3.jpg");
	list.add("c4.jpg");
	list.add("c5.jpg");
	
	
	setSize(1000, 1000);
	
	FlowLayout flow = new FlowLayout();
	
	getContentPane().setLayout(null);
	
	JLabel j1 = new JLabel("New label");
	j1.setBounds(12, 34, 213, 133);
	getContentPane().add(j1);
	ImageIcon icon1 = new ImageIcon((String) list.get(0));
	j1.setIcon(icon1);
	
	JLabel j2 = new JLabel("New label");
	j2.setBounds(12, 207, 213, 133);
	getContentPane().add(j2);
	ImageIcon icon2 = new ImageIcon((String) list.get(1));
	j2.setIcon(icon2);
	
	JLabel j3 = new JLabel("New label");
	j3.setBounds(12, 376, 213, 133);
	getContentPane().add(j3);
	ImageIcon icon3 = new ImageIcon((String) list.get(2));
	j3.setIcon(icon3);
	
	JLabel j4 = new JLabel("New label");
	j4.setBounds(12, 539, 213, 133);
	getContentPane().add(j4);
	ImageIcon icon4 = new ImageIcon((String) list.get(3));
	j4.setIcon(icon4);
	
	JLabel j5 = new JLabel("New label");
	j5.setBounds(12, 729, 213, 133);
	getContentPane().add(j5);
	ImageIcon icon5 = new ImageIcon((String) list.get(4));
	j5.setIcon(icon5);
	
	
	textField_2 = new JTextField();
	textField_3 = new JTextField();
	textField_4 = new JTextField();
	textField_5 = new JTextField();
	textField_6 = new JTextField();
	textField_2.setForeground(Color.BLACK);
	textField_2.setFont(new Font("굴림", Font.BOLD, 20));
	textField_2.setBackground(Color.WHITE);
	menuDAO dao = new menuDAO();
	ArrayList list1 = dao.selectAll();
	for (int i = 0; i < list1.size(); i++) {
		menuDTO dto = (menuDTO)list1.get(i);
		textField_2.setText("제품이름 : " + dto.getName() + "제품내용 : " + dto.getContent() + "제품가격 : " + dto.getPrice());
		textField_3.setText("제품이름 : " + dto.getName() + "제품내용 : " + dto.getContent() + "제품가격 : " + dto.getPrice());
		textField_4.setText("제품이름 : " + dto.getName() + "제품내용 : " + dto.getContent() + "제품가격 : " + dto.getPrice());
		textField_5.setText("제품이름 : " + dto.getName() + "제품내용 : " + dto.getContent() + "제품가격 : " + dto.getPrice());
		textField_6.setText("제품이름 : " + dto.getName() + "제품내용 : " + dto.getContent() + "제품가격 : " + dto.getPrice());
	}
	textField_2.setBounds(237, 34, 469, 50);
	
	getContentPane().add(textField_2);
	textField_2.setColumns(10);
	
	
	textField_3.setColumns(10);
	textField_3.setBounds(237, 207, 469, 50);
	getContentPane().add(textField_3);
	
	textField_4.setColumns(10);
	textField_4.setBounds(237, 376, 469, 50);
	getContentPane().add(textField_4);
	
	textField_5.setColumns(10);
	textField_5.setBounds(237, 539, 469, 50);
	getContentPane().add(textField_5);
	
	textField_6.setColumns(10);
	textField_6.setBounds(237, 729, 469, 50);
	getContentPane().add(textField_6);
	
	b1 = new JButton("\uC8FC\uBB38");
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			orderWindow o1 = new orderWindow();
			dispose();
		}
	});
	b1.setBounds(771, 89, 97, 23);
	getContentPane().add(b1);
	
	b2 = new JButton("\uC8FC\uBB38");
	b2.setBounds(771, 262, 97, 23);
	getContentPane().add(b2);
	
	b3 = new JButton("\uC8FC\uBB38");
	b3.setBounds(771, 431, 97, 23);
	getContentPane().add(b3);
	
	b4 = new JButton("\uC8FC\uBB38");
	b4.setBounds(771, 594, 97, 23);
	getContentPane().add(b4);
	
	b5 = new JButton("\uC8FC\uBB38");
	b5.setBounds(771, 784, 97, 23);
	getContentPane().add(b5);
	
	
	setVisible(true);
		}
}	
