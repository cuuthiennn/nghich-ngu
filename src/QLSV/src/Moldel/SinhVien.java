package Moldel;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
	private String idStudent;
	private String nameStudent;
	private String homeTown;
	private Date birthday;
	private String Sex;
	private Float subjectScore_Math;
	private Float subjectScore_Physics;
	private Float subjectScore_Chemistry;
	
}
