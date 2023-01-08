package Moldel;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import View.SinhVienView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QLSVModel{

	private ArrayList<SinhVien> listStudent;
	private SinhVienView view ;

	public SinhVien CheckExist(String idStudent) {
		if(!listStudent.isEmpty()) {
			for(SinhVien s : listStudent) {
				if(s.getIdStudent().equals(idStudent)) {
					return s;
				}
			}
		}
		return null;
	}
	
	public void Update(SinhVien sv) {
		if(CheckExist(sv.getIdStudent()) == null) {
			JOptionPane.showMessageDialog(view, "Student is not exist!");
			return;
		} else {
			
			listStudent.remove(this.getOrder(sv));
			listStudent.add(sv);
		}
	}
	
	public void Delete(SinhVien sv, int rowCount) {
		if(CheckExist(sv.getIdStudent()) == null) {
			JOptionPane.showMessageDialog(view, "Student is not exist!");
			return;
		} else {
			listStudent.remove(rowCount);
		}
	}
	
	public void Save(SinhVien sv) {
		if(CheckExist(sv.getIdStudent()) != null) {
			JOptionPane.showMessageDialog(view, "Student is exist!");
			return;
		}else {
			this.listStudent.add(sv);
		}	
	}
	
	public static ArrayList<String> getDSTinh(){
		String[] arr_tinh = {"An Giang",
							"Bà Rịa – Vũng Tàu",
							"Bạc Liêu",
							"Bắc Giang",
							"Bắc Kạn",
							"Bắc Ninh",
							"Bến Tre",
							"Bình Dương",
							"Bình Định",
							"Bình Phước",
							"Bình Thuận",
							"Cà Mau",
							"Cao Bằng",
							"Cần Thơ",
							"Đà Nẵng",
							"Đắk Lắk",
							"Đắk Nông",
							"Điện Biên",
							"Đồng Nai",
							"Đồng Tháp",
							"Gia Lai",
							"Hà Giang",
							"Hà Nam",
							"Hà Nội",
							"Hà Tĩnh",
							"Hải Dương",
							"Hải Phòng",
							"Hậu Giang",
							"Hòa Bình",
							"Thành phố Hồ Chí Minh",
							"Hưng Yên",
							"Khánh Hòa",
							"Kiên Giang",
							"Kon Tum",
							"Lai Châu",
							"Lạng Sơn",
							"Lào Cai",
							"Lâm Đồng",
							"Long An",
							"Nam Định",
							"Nghệ An",
							"Ninh Bình",
							"Ninh Thuận",
							"Phú Thọ",
							"Phú Yên",
							"Quảng Bình",
							"Quảng Nam",
							"Quảng Ngãi",
							"Quảng Ninh",
							"Quảng Trị",
							"Sóc Trăng",
							"Sơn La",
							"Tây Ninh",
							"Thái Bình",
							"Thái Nguyên",
							"Thanh Hóa",
							"Thừa Thiên Huế",
							"Tiền Giang",
							"Trà Vinh",
							"Tuyên Quang",
							"Vĩnh Long",
							"Vĩnh Phúc",
							"Yên Bái"};
		

		ArrayList<String> listTinh = new ArrayList<>();
		for (String tenTinh : arr_tinh) {
			listTinh.add(tenTinh);
		}
		return listTinh;
	}

	public QLSVModel() {
		super();
		this.listStudent = new ArrayList<>();
	}
	
	public int getOrder(SinhVien sv) {
		if(!this.listStudent.isEmpty()) {
			for(int i = 0; i <listStudent.size(); i++) {
				if(sv.getIdStudent().equals(listStudent.get(i).getIdStudent())) {
					return i;
				}
			}
		}
		return -1;
	}
}
