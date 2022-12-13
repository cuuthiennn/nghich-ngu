package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyContrllerColor;
import model.MyColorModel;

public class MyColorView extends JFrame{
	private MyColorModel myModel;
	private JLabel jLabel;
	public MyColorView() {
		this.myModel = new MyColorModel();
		this.Init();
	}
	private void Init() {
		this.setTitle("My Color");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new MyContrllerColor(this);
		Font font = new Font("Arial", Font.BOLD, 18);
		JPanel jPanel = new JPanel();
		jLabel = new JLabel("----------", JLabel.CENTER);
		jLabel.setSize(600, 600);
		JLabel.setDefaultLocale(null);
		jPanel.setLayout(new GridLayout(2,3));
		
		JButton jButton_text_red = new JButton("RED TEXT");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.addActionListener(ac);
		JButton jButton_text_yellow = new JButton("YELLOW TEXT");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.YELLOW);
		jButton_text_yellow.addActionListener(ac);
		JButton jButton_text_green = new JButton("GREEN TEXT");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.addActionListener(ac);
		
		JButton jButton_background_red = new JButton("RED BACKGROUND");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.RED);
		jButton_background_red.addActionListener(ac);
		JButton jButton_background_yellow = new JButton("YELLOW BACKGROUND");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.addActionListener(ac);
		JButton jButton_background_green = new JButton("GREEN BACKGROUND");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.addActionListener(ac);
		
		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_green);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.SOUTH);
		
		this.setVisible(myModel.isOpaque());
	}
	public void changeColorText(Color color) {
		this.jLabel.setForeground(color);
		this.jLabel.setText("TEXT COLOR");
	}
	public void changeColorBackground(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}
}
