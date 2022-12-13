package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.MyColorModel;
import view.MyColorView;

public class MyContrllerColor implements ActionListener{
	private MyColorView myView;
	public MyContrllerColor(MyColorView myView) {
		this.myView = myView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("RED TEXT")) {
			this.myView.changeColorText(Color.RED);
		}else if(src.equals("YELLOW TEXT")) {
			this.myView.changeColorText(Color.YELLOW);
		}else if(src.equals("GREEN TEXT")) {
			this.myView.changeColorText(Color.GREEN);
		} else if(src.equals("RED BACKGROUND")) {
			this.myView.changeColorBackground(Color.RED);
		}else if(src.equals("YELLOW BACKGROUND")) {
			this.myView.changeColorBackground(Color.YELLOW);
		}else if(src.equals("GREEN BACKGROUND")) {
			this.myView.changeColorBackground(Color.GREEN);
		}
	}
	
}
