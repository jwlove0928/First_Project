package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Memberinsert extends JFrame{
	private JTextField idText;
	private JTextField pwText;
	private JTextField userText;
	private JTextField telText;

	public Memberinsert() {
		
		setSize(500, 500);
		
		setTitle("회원가입 창");
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 10, 215, 46);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uC544\uC774\uB514");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(35, 79, 76, 32);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setFont(new Font("굴림", Font.BOLD, 20));
		label_1.setBounds(35, 138, 105, 32);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uC774\uB984");
		label_2.setFont(new Font("굴림", Font.BOLD, 20));
		label_2.setBounds(35, 211, 76, 32);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_3.setFont(new Font("굴림", Font.BOLD, 20));
		label_3.setBounds(35, 298, 105, 32);
		getContentPane().add(label_3);
		
		idText = new JTextField();
		idText.setBounds(163, 82, 257, 32);
		getContentPane().add(idText);
		idText.setColumns(10);
		
		pwText = new JTextField();
		pwText.setColumns(10);
		pwText.setBounds(163, 138, 257, 32);
		getContentPane().add(pwText);
		
		userText = new JTextField();
		userText.setColumns(10);
		userText.setBounds(163, 211, 257, 32);
		getContentPane().add(userText);
		
		telText = new JTextField();
		telText.setColumns(10);
		telText.setBounds(163, 298, 257, 32);
		getContentPane().add(telText);
		
		
		JButton btnNewButton = new JButton("\uC644\uB8CC"); //회원가입 완료버튼
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MemberDTO dto = new MemberDTO();
				MemberDAO dao = new MemberDAO();
				String id = idText.getText();
				String pw = pwText.getText();
				String user = userText.getText();
				String tel = telText.getText();
				dto.setId(id);
				dto.setPw(pw);
				dto.setUser(user);
				dto.setTel(tel);
				
				dao.insert(dto);
				JOptionPane.showMessageDialog(null, "회원가입 완료");
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(192, 396, 105, 33);
		getContentPane().add(btnNewButton);
		setVisible(true);
	}
}
