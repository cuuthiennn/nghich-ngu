package lab7;

public class Vuong extends NhuNhat{

	public Vuong() {
		super();
	}

	public Vuong(Double canh) {
		super(canh, canh);
	}
	
	@Override
	public void xuat() {
		System.out.println("Chu vi: " + getChuVi());
		System.err.println("Dien tich: " + getDienTich());
	}
}
