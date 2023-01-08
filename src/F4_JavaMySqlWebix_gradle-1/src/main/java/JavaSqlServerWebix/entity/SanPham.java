package JavaSqlServerWebix.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
	private Long maSp;
	private String tenSp;
	private String moTa;
	private int gia;
	private LoaiSP loaiSp;
	private Long maLoai;
}
