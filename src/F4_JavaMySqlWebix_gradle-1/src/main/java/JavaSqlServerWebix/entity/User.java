package JavaSqlServerWebix.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String maKH;
	private String tenKH;
	private String diaChi;
	private String dienThoai;
}
