package fistproject;

import java.util.Scanner;

public class SinhVien {
	//static Scanner scan = new Scanner(System.in);
	private String tenSV;
	private String maSV;
	private String tenLop;
	private String ngaySinh;
	public SinhVien() {
	}
	public SinhVien(String tenSV, String maSV, String tenLop, String ngaySinh) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.tenLop = tenLop;
		this.ngaySinh = ngaySinh;
	}
	public String getTenSV() {
		return this.tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public String getMaSV() {
		return this.maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenLop() {
		return this.tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getNgaySinh() {
		return this.ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public void xuatThongTinSV() {
		System.out.println("Ho va ten: " + this.getTenSV());
		System.out.println("Ma so sinh vien: " + this.getMaSV());
		System.out.println("Ten lop: " + this.getTenLop());
		System.out.println("Ngay sinh: " + this.getNgaySinh());
	}
	
	
	public SinhVien SuaSV(SinhVien[] sv, int soLuongSV, String tenSVSua) {
		SinhVien tempSV = new SinhVien();
		
		
		return tempSV;
	}
}
