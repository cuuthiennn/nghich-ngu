package JavaSqlServerWebix.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NguyenLieu {
	
	private String maNl;
	private String tenNl;
	private String donViTinh;
	private int gia;
}
