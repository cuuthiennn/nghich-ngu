package fistproject;



public class main {
	public static void main(String args[]) {
		SinhVien s = new SinhVien();
		s.setTenSV("abs");
		SinhVien a = new SinhVien();
		a = s;
		a.setTenSV("vai lol");
		System.out.println(a.getTenSV());
		System.out.println(s.getTenSV());
	}
}
