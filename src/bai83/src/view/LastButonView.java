package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicFormattedTextFieldUI;

import controller.listener;
import lombok.Data;
import model.LastButtonModel;


public class LastButonView extends JFrame{
	private JLabel jLabel;
	private LastButtonModel lastbutton;
	public LastButonView() {
		this.lastbutton = new LastButtonModel();
		this.Init();
	}
	public void Init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		ActionListener ac = new listener(this);
		
		JPanel jPanel_Center = new JPanel();
		jPanel_Center.setLayout(new GridLayout(2,2));
		
		Font font = new Font("Arial", Font.BOLD, 20);
		
		JButton jButton_do = new JButton("do");
		jButton_do.setFont(font);
		jButton_do.addActionListener(ac);
		JButton jButton_2= new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(ac);
		JButton jButton_3 = new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(ac);
		JButton jButton_4 = new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(ac);
		
		
		jPanel_Center.add(jButton_1);
		jPanel_Center.add(jButton_2);
		jPanel_Center.add(jButton_3);
		jPanel_Center.add(jButton_4);
		
		JPanel jPanel_footer = new JPanel();
		jLabel = new JLabel("--------");
		jLabel.setFont(font);
		jPanel_footer.add(jLabel, JLabel.CENTER);
		this.setLayout(new BorderLayout());
		
		this.add(jPanel_Center, BorderLayout.CENTER);
		this.add(jPanel_footer, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	public void changeTo_1() {
		this.lastbutton.setValue(1);
		jLabel.setText("Last number chose is " + this.lastbutton.getValue());
	}
	public void changeTo_2() {
		this.lastbutton.setValue(2);
		jLabel.setText("Last number chose is " + this.lastbutton.getValue());
	}
	public void changeTo_3() {
		this.lastbutton.setValue(3);
		jLabel.setText("Last number chose is " + this.lastbutton.getValue());
	}
	public void changeTo_4() {
		this.lastbutton.setValue(4);
		jLabel.setText("Last number chose is " + this.lastbutton.getValue());
	}
}
