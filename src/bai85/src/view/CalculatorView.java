package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ColculatorListener;
import model.CalculatorModel;

public class CalculatorView extends JFrame{
	private CalculatorModel caModel;
	private JTextField text_fistValue;
	private JTextField text_secondValue;
	private JTextField text_answer;
	private JLabel jLabel_fistValue;
	private JLabel jLabel_secondValue;
	private JLabel jLabel_answer;
	
	public CalculatorView(CalculatorModel caModel) throws HeadlessException {
		this.caModel = caModel;
		this.Init();
	}

	public CalculatorView() {
		this.caModel = new CalculatorModel();
		this.Init();
		
	}
	private void Init() {
		this.setTitle("Mini Calculator");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		ActionListener ac = new ColculatorListener(this);
		Font font = new Font("Arial", Font.BOLD, 14);
		jLabel_fistValue = new JLabel("1st Value");
		jLabel_fistValue.setFont(font);
		jLabel_secondValue = new JLabel("2st Value");
		jLabel_secondValue.setFont(font);
		jLabel_answer = new JLabel("Answer");
		jLabel_answer.setFont(font);
		
		text_fistValue = new JTextField(50);
		text_fistValue.setFont(font);
		text_secondValue = new JTextField(50);
		text_secondValue.setFont(font);
		text_answer = new JTextField(50);
		text_answer.setFont(font);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(3,2));
		
		jPanel.add(jLabel_fistValue);
		jPanel.add(text_fistValue);
		jPanel.add(jLabel_secondValue);
		jPanel.add(text_secondValue);
		jPanel.add(jLabel_answer);
		jPanel.add(text_answer);
		
		JPanel jPanel_Button = new JPanel();
		jPanel_Button.setLayout(new GridLayout(3,3));
		
		JButton jButton_sum = new JButton("+");
		jButton_sum.setFont(font);
		jButton_sum.addActionListener(ac);
		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(ac);
		JButton jButton_muliply = new JButton("*");
		jButton_muliply.setFont(font);
		jButton_muliply.addActionListener(ac);
		JButton jButton_devide = new JButton("/");
		jButton_devide.setFont(font);
		jButton_devide.addActionListener(ac);
		JButton jButton_power = new JButton("^");
		jButton_power.setFont(font);
		jButton_power.addActionListener(ac);
		JButton jButton_mod = new JButton("MOD");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(ac);
		
		jPanel_Button.add(jButton_sum);
		jPanel_Button.add(jButton_minus);
		jPanel_Button.add(jButton_muliply);
		jPanel_Button.add(jButton_devide);
		jPanel_Button.add(jButton_power);
		jPanel_Button.add(jButton_mod);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
		this.add(jPanel_Button, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void sum() {
		double fistValue = Double.valueOf(this.text_fistValue.getText());
		double secondValue = Double.valueOf(this.text_secondValue.getText());
		this.caModel.setFistValue(fistValue);
		this.caModel.setSecondValue(secondValue);
		this.caModel.sum();
		this.text_answer.setText(this.caModel.getAnswer()+"");
	}
	public void minus() {
		double fistValue = Double.valueOf(this.text_fistValue.getText());
		double secondValue = Double.valueOf(this.text_secondValue.getText());
		this.caModel.setFistValue(fistValue);
		this.caModel.setSecondValue(secondValue);
		this.caModel.minus();
		this.text_answer.setText(this.caModel.getAnswer()+"");
	}
	public void multiply() {
		double fistValue = Double.valueOf(this.text_fistValue.getText());
		double secondValue = Double.valueOf(this.text_secondValue.getText());
		this.caModel.setFistValue(fistValue);
		this.caModel.setSecondValue(secondValue);
		this.caModel.multiply();
		this.text_answer.setText(this.caModel.getAnswer()+"");
	}
	public void devide() {
		double fistValue = Double.valueOf(this.text_fistValue.getText());
		double secondValue = Double.valueOf(this.text_secondValue.getText());
		this.caModel.setFistValue(fistValue);
		this.caModel.setSecondValue(secondValue);
		this.caModel.devide();
		this.text_answer.setText(this.caModel.getAnswer()+"");
	}
	public void power() {
		double fistValue = Double.valueOf(this.text_fistValue.getText());
		double secondValue = Double.valueOf(this.text_secondValue.getText());
		this.caModel.setFistValue(fistValue);
		this.caModel.setSecondValue(secondValue);
		this.caModel.power();
		this.text_answer.setText(this.caModel.getAnswer()+"");
	}
	public void mod() {
		double fistValue = Double.valueOf(this.text_fistValue.getText());
		double secondValue = Double.valueOf(this.text_secondValue.getText());
		this.caModel.setFistValue(fistValue);
		this.caModel.setSecondValue(secondValue);
		this.caModel.mod();
		this.text_answer.setText(this.caModel.getAnswer()+"");
	}
}
