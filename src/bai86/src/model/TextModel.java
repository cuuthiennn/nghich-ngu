package model;

public class TextModel {
	private String vanBan;
	private String ketQua;
	private String timKiem;
	public TextModel() {
		this.ketQua = "";
		this.timKiem = "";
		this.vanBan = "";
	}
	public TextModel(String vanBan, String ketQua, String timKiem) {
		this.vanBan = vanBan;
		this.ketQua = ketQua;
		this.timKiem = timKiem;
	}
	public String getVanBan() {
		return vanBan;
	}
	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}
	public String getKetQua() {
		return ketQua;
	}
	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}
	public String getTimKiem() {
		return timKiem;
	}
	public void setTimKiem(String timKiem) {
		this.timKiem = timKiem;
	}
	public int research() {
		int count =0;
		int location = 0;
		while(true) {
			int i= this.vanBan.indexOf(this.timKiem, location);
			if(i == -1) {
				break;
			}else {
				count++;
				location = i+1;
			}
		}
		return count;
	}
}
