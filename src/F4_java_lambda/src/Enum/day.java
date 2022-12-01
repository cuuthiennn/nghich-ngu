package Enum;

public enum day {
	Monday(2),
	Tusday(3),
	Wednday(4),
	Thursday(5),
	Friday(6),
	Saturday(7),
	Sunday(8);
	int values;
	day(int value) {
		this.values = value;
	}
	public int value() {
		return this.values;
	}
}
