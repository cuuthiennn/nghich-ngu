package lab5;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private Double donGia;
	private Double giamGia;
	Scanner scan = new Scanner(System.in);
	
	public SanPham() {
		
	}
	
	public SanPham(String tenSP, Double donGia, Double giamGia) {
		this.tenSp = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public SanPham(String tenSP, Double donGia) {
		this(tenSP, donGia, (double) 0);
	}
	
	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public Double getDonGia() {
		return donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	public Double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(Double giamGia) {
		this.giamGia = giamGia;
	}
	
	public Double getThueNhapKhau() {
		return this.getDonGia() * 0.1;
	}
	
	public void nhap(SanPham s) {
		String tenSP;
		Double donGia;
		Double giamGia;
		System.out.println("Nhap ten SP: ");
		tenSP = scan.nextLine();
		s.setTenSp(tenSP);
		System.out.println("Nhap don gia: ");
		donGia = scan.nextDouble();
		s.setDonGia(donGia);
		System.out.println("Nhap gia giam: ");
		giamGia = scan.nextDouble();
		s.setGiamGia(giamGia);
	}
	
	public void xuat() {
		System.out.println("Ten SP: " + getTenSp());
		System.out.println("Don gia: " + getDonGia());
		System.out.println("Gia giam: " + getGiamGia());
	}

}
