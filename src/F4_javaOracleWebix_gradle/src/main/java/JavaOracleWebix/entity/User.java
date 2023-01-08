package JavaOracleWebix.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class User {
	private int maKhachHang;
	private String tenKhachHang;
	private String diaChi;
	private String mail;
	private String phone;
	private String iMage;
	private Date birthday;
	private String isUse;
	private int role_RoleId;
	
	public int getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getiMage() {
		return iMage;
	}
	public void setiMage(String iMage) {
		this.iMage = iMage;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getIsUse() {
		return isUse;
	}
	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}
	public int getRole_RoleId() {
		return role_RoleId;
	}
	public void setRole_RoleId(int role_RoleId) {
		this.role_RoleId = role_RoleId;
	}
	
}