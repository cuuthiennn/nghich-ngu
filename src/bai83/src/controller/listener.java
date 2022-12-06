package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButonView;

public class listener implements ActionListener{
	private LastButonView xem;
	public listener(LastButonView xem) {
		this.xem = xem;
	}
	//set value to xem
	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals("1")) {
			this.xem.changeTo_1();
		}else if(button.equals("2")) {
			this.xem.changeTo_2();
		}else if(button.equals("3")) {
			this.xem.changeTo_3();
		}else if(button.equals("4")) {
			this.xem.changeTo_4();
		}
	}
	
}
