package lombok;

import lombok.Data;


@Data
@ToString(of = "name")
public class person {
	private int id;
	private String name;
	
}
