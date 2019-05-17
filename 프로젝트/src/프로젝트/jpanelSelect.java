package 프로젝트;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;

public class jpanelSelect extends JFrame{

	public jpanelSelect() {
		
		setSize(536, 563);
		
		getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("\uAC80\uC0C9\uACB0\uACFC");
		lb1.setFont(new Font("굴림", Font.BOLD, 30));
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setBounds(12, 10, 512, 64);
		getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("New label");
		lb2.setBounds(12, 102, 135, 136);
		getContentPane().add(lb2);
		
		
		
		setVisible(false);
		
	}
}
