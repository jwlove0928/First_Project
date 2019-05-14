package 프로젝트;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class MembershipMain {
   private JTextField idText;
   private JTextField pwText;
   private JTextField pwTextTest;
   private JTextField nameText;
   private JTextField telText;
   private JTextField addrText;
   private JTextField styleText;
   public MembershipMain() {
      JPanel p = new JPanel();
      p.setSize(400, 384);
      p.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("회원가입");
      lblNewLabel.setBackground(Color.YELLOW);
      lblNewLabel.setBounds(12, 0, 376, 25);
      p.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("아이디");
      lblNewLabel_1.setBounds(12, 46, 57, 15);
      p.add(lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel("비밀번호");
      lblNewLabel_2.setBounds(12, 82, 57, 15);
      p.add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel("비밀번호 확인");
      lblNewLabel_3.setBounds(12, 117, 82, 15);
      p.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("이름");
      lblNewLabel_4.setBounds(12, 152, 57, 15);
      p.add(lblNewLabel_4);
      
      JLabel lblNewLabel_5 = new JLabel("전화번호");
      lblNewLabel_5.setBounds(12, 190, 57, 15);
      p.add(lblNewLabel_5);
      
      JLabel lblNewLabel_6 = new JLabel("주소");
      lblNewLabel_6.setBounds(12, 232, 57, 15);
      p.add(lblNewLabel_6);
      
      JLabel lblNewLabel_7 = new JLabel("선호스타일");
      lblNewLabel_7.setBounds(12, 270, 71, 15);
      p.add(lblNewLabel_7);
      
      idText = new JTextField();
      idText.setBounds(106, 43, 139, 21);
      p.add(idText);
      idText.setColumns(10);
      
      pwText = new JTextField();
      pwText.setBounds(106, 79, 139, 21);
      p.add(pwText);
      pwText.setColumns(10);
      
      pwTextTest = new JTextField();
      pwTextTest.setBounds(106, 114, 139, 21);
      p.add(pwTextTest);
      pwTextTest.setColumns(10);
      
      nameText = new JTextField();
      nameText.setBounds(106, 149, 139, 21);
      p.add(nameText);
      nameText.setColumns(10);
      
      telText = new JTextField();
      telText.setBounds(106, 187, 139, 21);
      p.add(telText);
      telText.setColumns(10);
      
      addrText = new JTextField();
      addrText.setBounds(106, 229, 253, 21);
      p.add(addrText);
      addrText.setColumns(10);
      
      styleText = new JTextField();
      styleText.setBounds(106, 267, 139, 21);
      p.add(styleText);
      styleText.setColumns(10);
      
      JButton b2 = new JButton("회원가입 완료");
      b2.setBounds(142, 335, 119, 23);
      p.add(b2);
      
      JButton b1 = new JButton("중복확인");
      b1.setBounds(260, 42, 82, 23);
      p.add(b1);
      
      p.setVisible(true);
      
   }
}