package Entity;

import java.util.Comparator;

public class sinhvien {
	private int masv;
	private String tensv;
	private Double diemthi;
	public sinhvien() {
		
	}
	public sinhvien(int masv, String tensv, Double diemthi) {
		this.masv = masv;
		this.tensv = tensv;
		this.diemthi = diemthi;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getTensv() {
		return tensv;
	}
	public void setTensv(String tensv) {
		this.tensv = tensv;
	}
	public Double getDiemthi() {
		return diemthi;
	}
	public void setDiemthi(Double diemthi) {
		this.diemthi = diemthi;
	}
	public String getTen() {
		String s = this.tensv.trim();
		if(s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		}else {
			return s;
		}
	}
	@Override
	public String toString() {
		return "sinhvien [masv=" + masv + ", tensv=" + tensv + ", diemthi=" + diemthi + "]";
	}
	
}
