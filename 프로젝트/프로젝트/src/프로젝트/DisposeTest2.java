package 프로젝트;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DisposeTest2 extends JFrame implements ActionListener{
	
	DisposeTest sf;
	
	public DisposeTest2() {
		super("프레임생성");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton bt = new JButton("버튼");
		add(bt);
		bt.addActionListener(this);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(sf == null) {
			sf = new DisposeTest();
		}else {
			sf.dispose();
			sf = new DisposeTest();
		}
	}
	public static void main(String[] args) {
		new DisposeTest2();
	}
}
