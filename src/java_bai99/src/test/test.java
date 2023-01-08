package test;

import javax.swing.UIManager;

import view.MyNotepadView;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyNotepadView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
