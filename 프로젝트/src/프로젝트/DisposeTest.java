package ������Ʈ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DisposeTest extends JFrame implements ActionListener{
	
	public DisposeTest() {
		super("���� �ڽ�");
		setSize(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton bt = new JButton("�ݱ�");
		add(bt);
		bt.addActionListener(this);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}
