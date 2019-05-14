package 프로젝트;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class orderWindow extends JFrame{
	private JTextField textField;
	private JTextField textField_1;

	public orderWindow() {
		
		setSize(500, 500);
		
		
		getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(31, 28, 57, 15);
		getContentPane().add(l1);
		
		textField = new JTextField();
		menuDAO dao = new menuDAO();
		ArrayList list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			menuDTO dto = (menuDTO)list.get(0);
			textField.setText("제품이름 : " + dto.getName() + "제품내용 : " + dto.getContent() + "제품가격 : " + dto.getPrice());
		}
		
		textField.setBounds(100, 25, 249, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton b1 = new JButton("\uC0AD\uC81C");
		b1.setBounds(361, 24, 97, 23);
		getContentPane().add(b1);
		
		JLabel l2 = new JLabel("\uCD1D\uAE08\uC561");
		l2.setBounds(140, 381, 57, 15);
		getContentPane().add(l2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 378, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton b2 = new JButton("\uCD94\uAC00\uC8FC\uBB38");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				shirtMenu m1 = new shirtMenu();
				dispose();
			}
		});
		b2.setBounds(111, 414, 97, 23);
		getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC8FC\uBB38\uC644\uB8CC");
		b3.setBounds(228, 414, 97, 23);
		getContentPane().add(b3);
		
		
		setVisible(true);
		
	}
}
