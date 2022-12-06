package model;

public class CounterModel {
	private int value;
	public CounterModel() {
		this.value = 0;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public void inCresment() {
		this.value++;
	}
	
	public void deCresment() {
		this.value--;
	}
	
	public void reset() {
		this.value = 0;
	}
}
