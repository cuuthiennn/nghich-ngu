package main;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import Entity.sinhvien;

public class main {
	public static List<sinhvien> list = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		long t1 = System.currentTimeMillis();
		list.add(new sinhvien(1,"Bui Quoc Dat", 4.0));
		list.add(new sinhvien(4,"Luong Tuan Vy", 8.5));
		list.add(new sinhvien(3,"Le Phuoc Lai", 8.0));
		list.add(new sinhvien(2,"Dang Trung Tinh", 7.0));
		list.add(new sinhvien(5,"Thanh Phuc", 2.0));
		list.add(new sinhvien(6,"Thanh Nam", 5.0));
		list.add(new sinhvien(7,"Thien", 1.0));
		list.add(new sinhvien(8,"Chi Thanh", 6.0));
		list.add(new sinhvien(9,"Minh Thu", 6.7));
		List<sinhvien> trenTB = danhSachTrenTB(list);
		XuatDanhSach(trenTB);
		printSortByNameAndMSV(list);
		updateDiem();
		long t2 = System.currentTimeMillis();
		System.out.println("thoi gian chay: "+ (t2 - t1) + "mls");
	}
//	1/ Viết hàm trả về một danh sách các bạn sinh viên có điểm trên trung bình.
	public static List<sinhvien>  danhSachTrenTB(List<sinhvien> list) {
		List<sinhvien> tempSV = new ArrayList<>();
		for(sinhvien x : list) {
			if(x.getDiemthi() > 5) {
				tempSV.add(x);
			}
		}
		return tempSV;
	}
//	2/ Viết hàm in ra danh sách ở bài 1.
	public static void XuatDanhSach(List<sinhvien> list) {
		for(sinhvien x : list) {
				System.out.println(x.toString()); 
		}
	}
//	3/ Viết 2 hàm riêng biệt in ra danh sách dx sắp xếp theo mã sinh viên   và tên sinh viên. 
	public static Comparator<sinhvien> sortByName = new Comparator<sinhvien>() {
		
		@Override
		public int compare(sinhvien o1, sinhvien o2) {
			return o1.getTen().compareTo(o2.getTen());
		}
	};
	public static Comparator<sinhvien> sortByMSV = new Comparator<sinhvien>() {
	
		@Override
		public int compare(sinhvien o1, sinhvien o2) {
			return o1.getMasv() - o2.getMasv();
		}
	};
	
	public static void printSortByName(List<sinhvien> list) {
		Collections.sort(list, sortByName);
		XuatDanhSach(list);
	}
	public static void printSortByMSV(List<sinhvien> list) {
		Collections.sort(list, sortByMSV);
		XuatDanhSach(list);
	}
//	[Sau khi viết Xong, comment code lại và gộp 2 hàm này thành 1 hàm duy nhất].
	public static void printSortByNameAndMSV(List<sinhvien> list) {
		int n;
		do {
			System.out.println("1.Sap xep theo ten.");
			System.out.println("2.Sap xep theo ma sinh vien.");
			System.out.println("3.Thoat.");
			System.out.println("Nhap lenh: ");
			n = scan.nextInt();
			switch(n) {
				case 1: Collections.sort(list, sortByName);
						XuatDanhSach(list);
						break;
				case 2: Collections.sort(list, sortByMSV);
						XuatDanhSach(list);
						break;
				case 3: return;
				default: break;
			}
		}while(n != 3);
		
	}
//	4/ In ra danh sách các sinh viên được tăng điểm
//	[bạn nào có điểm < 5.0 thì được + 0.5 điểm]
	public static void updateDiem() {
		for(sinhvien x : list) {
			if(x.getDiemthi() < 5.0) {
				Double temp = x.getDiemthi() + + 0.5;
				x.setDiemthi(temp);
				System.out.println(x.toString());
			}
		}
	}
	
}
