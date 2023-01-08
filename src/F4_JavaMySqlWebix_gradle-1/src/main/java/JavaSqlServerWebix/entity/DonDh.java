package JavaSqlServerWebix.entity;

import java.sql.Date;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonDh {
	private Long soDDH;
	private Date ngayDat;
	private User khachHang;
}
