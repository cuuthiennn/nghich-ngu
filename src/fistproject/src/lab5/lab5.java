package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lab5 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		List<SanPham> list = new ArrayList<>();
		while(true){
			SanPham tempSP = new SanPham();
			tempSP.nhap(tempSP);
			list.add(tempSP);
			System.out.println("Ban muon tiep tuc(Y/N)");
			if(scan.next().toUpperCase().equals("N")) {
				break;
			}
		}
		
		for(SanPham  sanPham : list) {
			sanPham.xuat();
		}
	}
}
