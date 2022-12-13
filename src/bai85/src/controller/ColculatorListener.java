package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorView;

public class ColculatorListener implements ActionListener{
	private CalculatorView calView;

	public ColculatorListener(CalculatorView calView) {
		this.calView = calView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("+")) {
			this.calView.sum();
		}else if(src.equals("-")) {
			this.calView.minus();
		}else if(src.equals("*")) {
			this.calView.multiply();
		}else if(src.equals("/")) {
			this.calView.devide();
		}else if(src.equals("^")) {
			this.calView.power();
		}else if(src.equals("MOD")) {
			this.calView.mod();
		}
		
	}
}
