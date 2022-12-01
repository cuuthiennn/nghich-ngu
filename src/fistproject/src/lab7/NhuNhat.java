package lab7;

public class NhuNhat {
	private Double rong;
	private Double dai;
	public NhuNhat(){
		
	}
	public NhuNhat(Double dai, Double rong){
		this.rong = rong;
		this.dai = dai;
	}
	public Double getRong() {
		return rong;
	}
	public void setRong(Double rong) {
		this.rong = rong;
	}
	public Double getDai() {
		return dai;
	}
	public void setDai(Double dai) {
		this.dai = dai;
	}
	public Double getChuVi() {
		return (getDai() + getRong())*2;
	}
	public Double getDienTich() {
		return getDai()*getRong();
	}
	public void xuat() {
		System.out.println("Chu vi: " + getChuVi());
		System.out.println("Dien tich: " + getDienTich());
	}
}
