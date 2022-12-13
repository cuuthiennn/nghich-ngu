package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TextModel;
import view.TextView;

public class TextListener implements ActionListener{
	private TextView textView;
	public TextListener(TextView textView) {
		this.textView = textView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.textView.research();
		
	}

}
