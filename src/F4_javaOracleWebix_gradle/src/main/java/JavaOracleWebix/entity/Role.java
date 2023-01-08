package JavaOracleWebix.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
	private Long roleId;
	private String roleName;
	private String isUser;
	private String iMage;
	private String description;
}
