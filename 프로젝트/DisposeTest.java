package 프로젝트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DisposeTest extends JFrame implements ActionListener{
	
	public DisposeTest() {
		super("나는 자식");
		setSize(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton bt = new JButton("닫기");
		add(bt);
		bt.addActionListener(this);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}
