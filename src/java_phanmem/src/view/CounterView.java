package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	private CounterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JLabel jLabel_value;
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.iNit();
		this.setVisible(true);
	}
	
	public void iNit() {
		this.setTitle("Counter");
		this.setSize(200,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		jButton_up = new JButton("UP");
		jButton_up.addActionListener(ac);
		
		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(ac);
		
		jLabel_value = new JLabel(this.counterModel.getValue()+ "", JLabel.CENTER);
		
		JPanel  jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jButton_down, BorderLayout.EAST);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	 
	public void deCresment() {
		this.counterModel.deCresment();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	
	public void inCresment() {
		this.counterModel.inCresment();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	
}
