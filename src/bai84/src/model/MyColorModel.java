package model;

import java.awt.Color;

public class MyColorModel {
	private Color foreground;
	private Color backround;
	private boolean opaque;
	public MyColorModel() {
		super();
		this.foreground = Color.BLACK;
		this.backround = Color.WHITE;
		this.opaque = true;
	}
	public Color getForeground() {
		return foreground;
	}
	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}
	public Color getBackround() {
		return backround;
	}
	public void setBackround(Color backround) {
		this.backround = backround;
	}
	public boolean isOpaque() {
		return opaque;
	}
	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
}
