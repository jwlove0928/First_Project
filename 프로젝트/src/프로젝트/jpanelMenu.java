package 프로젝트;

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

	public jpanelMenu(JFrameMain win) {
		this.win = win;
		setSize(536, 563);
		
		setLayout(null);
		
//		JButton[] button = new JButton[4];
//		for (int i = 0; i < button.length; i++) {
//			button[i] = new JButton("버튼" + i);
//		}
//		button[0].setBounds(50, 50, 150, 100);
//		add(button[0]);
//		button[1].setBounds(200, 50, 150, 50);
//		add(button[1]);
//		button[2].setBounds(350, 50, 150, 50);
//		add(button[2]);
//		button[3].setBounds(500, 50, 150, 50);
//		add(button[3]);
		
		
		JButton b1 = new JButton(); //상의버튼
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("Jpanel02");
			}
		});
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.GREEN);
		b1.setFont(new Font("굴림", Font.BOLD, 25));
		b1.setText("\uC0C1\uC758");
		add(b1);
		b1.setBounds(12, 74, 125, 50);
		
		
		JButton b2 = new JButton();
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLUE);
		b2.setFont(new Font("굴림", Font.BOLD, 25));
		b2.setText("\uD558\uC758");
		b2.setBounds(137, 74, 125, 50);
		add(b2);
		
		JButton b3 = new JButton();
		b3.setBackground(Color.WHITE);
		b3.setForeground(new Color(0, 0, 0));
		b3.setFont(new Font("굴림", Font.BOLD, 25));
		b3.setText("\uC2E0\uBC1C");
		b3.setBounds(260, 74, 125, 50);
		add(b3);
		
		JButton b4 = new JButton();
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.PINK);
		b4.setFont(new Font("굴림", Font.BOLD, 25));
		b4.setText("\uC544\uC6B0\uD130");
		b4.setBounds(385, 74, 125, 50);
		add(b4);
		
		JLabel label = new JLabel("\uC0C1\uD488\uC785\uB825");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(12, 23, 93, 29);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(105, 26, 306, 27);
		add(textField);
		String input = textField.getText();
		textField.setColumns(10);
		
		JButton b5 = new JButton("\uAC80\uC0C9"); //검색버튼
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//				menuDTO dto = new menuDTO();
//				menuDAO dao = new menuDAO();
//				dao.select(inputId);
//				if(inputId.equals(input)) {
//				String name = dto.getName();
//				String content = dto.getContent();
//				String price = dto.getPrice();
//				}else {
//					JOptionPane.showMessageDialog(null, "잘못된 입력값입니다. 다시 입력해주세요");
//				}
			}
		});
		b5.setFont(new Font("굴림", Font.BOLD, 15));
		b5.setBounds(423, 28, 97, 23);
		add(b5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 134, 492, 291);
		add(lblNewLabel);
		
		setVisible(true);
	}
}
