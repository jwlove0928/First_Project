package 프로젝트;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class jpanelOrder extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	public int witch = 0;
	private JFrameMain win;

	public jpanelOrder(JFrameMain win) {
		this.win = win;
		setSize(500, 500);
		setLayout(null);
		
		String[] pic = {"c1.jpg","c2.jpg","c3.jpg","c4.jpg","c5.jpg"};
		
		JLabel lb1 = new JLabel("New label");
		ImageIcon icon1 = new ImageIcon(pic[witch]);
		lb1.setBounds(0, 17, 150, 75);
		add(lb1);
		lb1.setIcon(icon1);
		
		JLabel lb2 = new JLabel("New label");
		ImageIcon icon2 = new ImageIcon(pic[witch+1]);
		lb2.setBounds(0, 102, 150, 75);
		add(lb2);
		lb2.setIcon(icon2);
		
		JLabel lb3 = new JLabel("New label");
		ImageIcon icon3 = new ImageIcon(pic[witch+2]);
		lb3.setBounds(0, 187, 150, 75);
		add(lb3);
		lb3.setIcon(icon3);
		
		JLabel lb4 = new JLabel("New label");
		ImageIcon icon4 = new ImageIcon(pic[witch+3]);
		lb4.setBounds(0, 285, 150, 75);
		add(lb4);
		lb4.setIcon(icon4);
		
		JLabel lb5 = new JLabel("New label");
		ImageIcon icon5 = new ImageIcon(pic[witch+4]);
		lb5.setBounds(0, 384, 150, 75);
		add(lb5);
		lb5.setIcon(icon5);
		
		textField = new JTextField();
		textField.setBounds(162, 17, 253, 29);
		menuDAO dao = new menuDAO();
		ArrayList list = dao.selectAll();
		System.out.println(list.size());
			menuDTO dto = (menuDTO)list.get(0);
			textField.setText("제품이름 : " + dto.getName() + "제품내용 : " + dto.getContent());
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 63, 253, 29);
			textField_1.setText("제품가격 : " + dto.getPrice());
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 102, 253, 29);
			menuDTO dto1 = (menuDTO)list.get(1);
			textField_2.setText("제품이름 : " + dto1.getName() + "제품내용 : " + dto1.getContent());
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(162, 148, 253, 29);
			textField_3.setText("제품가격 : " + dto1.getPrice());
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(162, 187, 253, 29);
			menuDTO dto2 = (menuDTO)list.get(2);
			textField_4.setText("제품이름 : " + dto2.getName() + "제품내용 : " + dto2.getContent());
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(162, 233, 253, 29);
			textField_5.setText("제품가격 : " + dto2.getPrice());
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 285, 253, 29);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(162, 331, 253, 29);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(162, 384, 253, 29);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(162, 430, 253, 29);
		add(textField_9);
		
		
		
		
		
		
		
		setVisible(true);
		
	}
}
