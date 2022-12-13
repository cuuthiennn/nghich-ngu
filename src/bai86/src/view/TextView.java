package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TextListener;
import model.TextModel;

public class TextView extends JFrame{
	private TextModel textModel;
	private JTextField resreach;
	private JTextArea document;
	private JLabel result;
	public TextView() {
		this.textModel = new TextModel();
		this.Init();
	}
	private void Init() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial", Font.BOLD, 14);
		ActionListener ac = new TextListener(this);
		
		JLabel jLabel_title_document = new JLabel("Van Ban");
		jLabel_title_document.setFont(font);
		document = new JTextArea();
		document.setFont(font);
		JScrollPane thanhCuon = new JScrollPane();
		thanhCuon.setViewportView(document);
		JLabel jLabel_title_research = new JLabel("Tu Khoa");
		jLabel_title_research.setFont(font);
		resreach = new JTextField();
		resreach.setFont(font);
		
		result = new JLabel();
		result.setFont(font);
		JButton button_Research = new JButton("Tim Kiem");
		button_Research.addActionListener(ac);
		button_Research.setBackground(Color.pink);
		button_Research.setFont(font);
		
		JPanel jPanel_ChucNang = new JPanel(new GridLayout(2,2,10,10));
		jPanel_ChucNang.add(jLabel_title_research);
		jPanel_ChucNang.add(resreach);
		jPanel_ChucNang.add(button_Research);
		jPanel_ChucNang.add(result);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel_title_document, BorderLayout.NORTH);
		this.add(thanhCuon, BorderLayout.CENTER);
		this.add(jPanel_ChucNang, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void research() {
		this.textModel.setVanBan(this.document.getText());
		this.textModel.setTimKiem(this.resreach.getText());
		this.textModel.setKetQua("Tu khoa xuat hien "+ this.textModel.research()+" lan.");
		this.result.setText(this.textModel.getKetQua());
	}
}
