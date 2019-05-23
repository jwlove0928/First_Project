package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class jframeorserch extends JFrame{

	public jframeorserch () {
		
		
		
		setSize(500, 500);
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38\uB0B4\uC5ED \uD655\uC778");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 484, 73);
		getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();

		orrderDTO dto = new orrderDTO();
		ArrayList list = new ArrayList();
		String dto1 = (String)list.get(0);
		textArea.append(dto1);
		
		textArea.setBounds(10, 83, 462, 340);
		getContentPane().add(textArea);
		
		
		setTitle("주문내역 확인");
		
		
		
		setVisible(true);
		
	}
}
