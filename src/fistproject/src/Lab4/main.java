package Lab4;

import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);
	public static <sanpham> void main(String args[]) {
		System.out.println("Nhap so luong san pham: ");
		Integer soLuonSp = scan.nextInt();
		SanPham[] sanPham = new SanPham[soLuonSp];
		for(int i = 0; i < soLuonSp; i++) {
			SanPham tempSP = new SanPham();
			tempSP.nhap(tempSP);
			sanPham[i] = tempSP;
			System.out.println("++++++++++");
		}
		
		for(int i = 0; i < soLuonSp; i++) {
			sanPham[i].xuat();
			System.out.println("++++++++++");
		}
	}
}
