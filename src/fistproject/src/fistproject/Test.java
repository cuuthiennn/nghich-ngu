package fistproject;

import java.util.Scanner;

public class Test {
	static final Scanner scan = new Scanner(System.in);
	static Integer soLuongSV;
	static SinhVien[] sv;
	public static void main(String args[]) {
		System.out.println("Nhap so luong sinh vien: ");
		soLuongSV = scan.nextInt();
		//scan.next();
		sv = new SinhVien[soLuongSV];
		for(int i = 0; i < soLuongSV; i++) {
		SinhVien tempSV = new SinhVien();
		System.out.println("Nhap ten sinh vien: ");
		scan.nextLine();
		tempSV.setTenSV(scan.nextLine());
			
			System.out.println("Nhap ma sinh vien: ");
			tempSV.setMaSV(scan.next());
			scan.nextLine();
			
			System.out.println("Nhap ngay sinh: ");
			tempSV.setNgaySinh(scan.next());
			scan.nextLine();
			
			System.out.println("Nhap ten lop: ");
			tempSV.setTenLop(scan.next());
			scan.nextLine();
			
			sv[i] = tempSV;
		}
		
		for(int i = 0; i < soLuongSV; i++) {
			sv[i].xuatThongTinSV();
			System.out.println("+++++++++++++++++++++++");
		}
		
		System.out.println("Nhap ma sinh vien can update: ");
		String updateSVIntomaSV = scan.next();
		Integer index = TimViTriSV(updateSVIntomaSV);
		
		UpDateSVIntomaSV(updateSVIntomaSV);
		
		for(int i = 0; i < soLuongSV; i++) {
			sv[i].xuatThongTinSV();
			System.out.println("+++++++++++++++++++++++");
		}
	}
	
	static public int TimViTriSV(String maSV) {
		for(int i = 0; i < soLuongSV; i++) {
			
			if(sv[i].getMaSV().equals(maSV)) {
				return i;
			}
		}
		return -1;
	}
	public static void UpDateSVIntomaSV(String maSV) {
		int temp = TimViTriSV(maSV);
		int n;
		
		do {
			
			System.out.println("1.Update ten.");
			System.out.println("2.Update ngay sinh.");
			System.out.println("3.Update lop.");
			System.out.println("4.Exit program.");
			System.out.println("Nhap lenh thuc hien: ");
			n = scan.nextInt();
			
			switch(n){
			
				case 1: String updateName;
						System.out.println("Nhap ten muon doi: ");
						scan.nextLine();
						updateName = scan.nextLine();
						sv[temp].setTenSV(updateName);
						break;
						
				case 2: String updateNGS;
						System.out.println("Nhap ngay sinh muon doi: ");
						updateNGS = scan.next();
						sv[temp].setNgaySinh(updateNGS);
						break;
						
				case 3: String updateClass;
						System.out.println("Nhap ten lop muon doi: ");
						updateClass = scan.next();scan.next();
						sv[temp].setTenLop(updateClass);
						break;
						
				default: break;
				
				case 4: return;
			}
			
		}while(n != 4);
		
	}
}
