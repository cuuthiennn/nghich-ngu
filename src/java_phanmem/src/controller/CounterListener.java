package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import view.CounterView;

public class CounterListener implements ActionListener{

	private CounterView ctv;
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("UP")) {
			ctv.inCresment();
		}else if(src.equals("DOWN")){
			ctv.deCresment();
		}
	}
	
}
